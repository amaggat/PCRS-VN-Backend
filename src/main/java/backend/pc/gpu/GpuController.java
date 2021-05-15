package backend.pc.gpu;

import backend.recommendation.type.repository.GpuRatingRepository;
import backend.security.utils.JwtUtils;
import backend.user.User;
import backend.user.UserActivity;
import backend.user.UserActivityRepository;
import backend.user.UserRepository;
import backend.util.ClientLevel;
import backend.util.Recommender;
import backend.util.Result;
import backend.util.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
public class GpuController {

    private static final Logger logger = LogManager.getLogger(GpuController.class);

    @Autowired
    private JwtUtils jwtUtil;
    private final UserActivityRepository userActivityRepository;
    private final UserRepository userRepository;
    private final GpuRepository gpuRepository;
    private final GpuRatingRepository gpuRatingRepository;

    public GpuController(UserActivityRepository userActivityRepository, UserRepository userRepository, GpuRepository gpuRepository, GpuRatingRepository gpuRatingRepository) {
        this.userActivityRepository = userActivityRepository;
        this.userRepository = userRepository;
        this.gpuRepository = gpuRepository;
        this.gpuRatingRepository = gpuRatingRepository;
    }

    @GetMapping("/api/gpu")
    public Page<GraphicProcessor> list(@RequestParam(name = "name", required = false) String name,
                                       @RequestParam(name = "chipset", required = false) String chipset,
                                       @RequestParam(name = "manufacturer", required = false) String manufacturer,
                                       @RequestParam(name = "VRam", required = false) Integer VRam,
                                       Pageable pageable) {
        Page<GraphicProcessor> gpu = gpuRepository.findAll((Specification<GraphicProcessor>) (root, cq, cb) -> {
            Predicate p = cb.conjunction();
            if (Objects.nonNull(chipset)) {
                p = cb.and(p, cb.like(root.get("chipset"), "%" + chipset + "%"));
            }
            if (Objects.nonNull(manufacturer)) {
                p = cb.and(p, cb.like(root.get("manufacturer"), "%" + manufacturer + "%"));
            }
            if (Objects.nonNull(VRam)) {
                p = cb.and(p, cb.equal(root.get("VRam"), VRam));
            }
            if (!StringUtils.isEmpty(name)) {
                p = cb.and(p, cb.like(root.get("fullname"), "%" + name + "%"));
            }
            cq.orderBy(cb.desc(root.get("fullname")), cb.asc(root.get("id")));
            return p;
        }, pageable);
        return gpu;
    }

    @GetMapping("/api/gpu/{id}")
    public GraphicProcessor SearchById(@PathVariable("id") String id, @CookieValue(value = "username", required = false) String username) {
        GraphicProcessor gpu = gpuRepository.findByID(id);

        try {
            User user = userRepository.findUserByUsername(username);
            if (user != null) {
                userActivityRepository.save(new UserActivity(user, "view", gpu.getId()));
                Utility.sendActivity("http://localhost:9090/engines/pcrs_change/events", "view", user.getId(), gpu.getId());
                gpuRepository.update(id);
            }
            gpu.setGpuRating(gpuRatingRepository.findById(user.getId() + "-" + id));
            logger.log(ClientLevel.CLIENT, "Success");
            return gpu;

        } catch (Exception e) {
            logger.log(ClientLevel.CLIENT, "Unsuccess");
            return gpu;
        }
    }

    @GetMapping("/api/recommend/gpu")
    public Page<GraphicProcessor> recommendFront(@CookieValue(value = "userid", required = false) Integer userId) {
        List<GraphicProcessor> graphicProcessors = new ArrayList<>();

        try {
            Result result = Utility.returnReccomendedItem(Utility.URL, null, "gpu", userId);
            for (Recommender recommender : result.getResult()) {
                System.out.println(recommender.getItem() + " " + recommender.getScore());
                graphicProcessors.add(gpuRepository.findByID(recommender.getItem()));
            }
            Page<GraphicProcessor> gpuPage = new PageImpl<>(graphicProcessors);
            return gpuPage;
        } catch (Exception e) {
            Page<GraphicProcessor> gpuPage = new PageImpl<>(graphicProcessors);
            return gpuPage;
        }
    }

    @GetMapping("/api/recommend/gpu/{id}")
    public Page<GraphicProcessor> recommendList(@PathVariable("id") String id, @CookieValue(value = "userid", required = false) Integer userId) {
        GraphicProcessor gpu = gpuRepository.findByID(id);
        List<GraphicProcessor> graphicProcessors = new ArrayList<>();

        try {
            Result result = Utility.returnReccomendedItem(Utility.URL, gpu.getId(), "gpu", userId);
            for (Recommender recommender : result.getResult()) {
                if (recommender.getScore() > 0) {
                    System.out.println(recommender.getItem() + " " + recommender.getScore());
                    graphicProcessors.add(gpuRepository.findByID(recommender.getItem()));
                }
            }
            Page<GraphicProcessor> gpuPage = new PageImpl<>(graphicProcessors);
            return gpuPage;
        } catch (Exception e) {
            Page<GraphicProcessor> gpuPage = new PageImpl<>(graphicProcessors);
            return gpuPage;
        }
    }

}
