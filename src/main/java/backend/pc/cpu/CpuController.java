package backend.pc.cpu;


import backend.recommendation.type.rating.CpuRating;
import backend.recommendation.type.repository.CpuRatingRepository;
import backend.security.utils.JwtUtils;
import backend.user.*;
import backend.util.ClientLevel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;
import java.util.Optional;
import javax.persistence.criteria.Predicate;

@RestController
public class CpuController {

    private static final Logger logger = LogManager.getLogger(CpuController.class);

    @Autowired
    private JwtUtils jwtUtil;
    private final UserActivityRepository userActivityRepository;
    private final UserRepository userRepository;
    private final CpuRatingRepository cpuRatingRepository;

    private final CpuRepository cpuRepository;

    public CpuController(CpuRepository cpuRepository, UserActivityRepository userActivityRepository, UserRepository userRepository, CpuRatingRepository cpuRatingRepository) {
        this.cpuRepository = cpuRepository;
        this.userActivityRepository = userActivityRepository;
        this.userRepository = userRepository;
        this.cpuRatingRepository = cpuRatingRepository;
    }

    @GetMapping("/api/cpu")
    public Page<CentralProcessor> list(@RequestParam(name = "name", required = false) String name,
                                       @RequestParam(name = "chipset", required = false) String chipset,
                                       @RequestParam(name = "manufacturer", required = false) String manufacturer,
                                       @RequestParam(name = "socket", required = false) String socket,
                                       @RequestParam(name = "cores", required = false) Integer cores,
                                       Pageable pageable
    ) {
        Page<CentralProcessor> cpu = cpuRepository.findAll((Specification<CentralProcessor>) (root, cq, cb) -> {
            Predicate p = cb.conjunction();
            if (Objects.nonNull(chipset)) {
                p = cb.and(p, cb.like(root.get("chipset"), "%" + chipset + "%"));
            }
            if (Objects.nonNull(manufacturer)) {
                p = cb.and(p, cb.like(root.get("manufacturer"), "%" + manufacturer + "%"));
            }
            if (Objects.nonNull(socket)) {
                p = cb.and(p, cb.like(root.get("socket"), "%" + socket + "%"));
            }
            if (Objects.nonNull(cores)) {
                p = cb.and(p, cb.equal(root.get("cores"), cores));
            }
            if (!StringUtils.isEmpty(name)) {
                p = cb.and(p, cb.like(root.get("fullname"), "%" + name + "%"));
            }
            cq.orderBy(cb.desc(root.get("fullname")), cb.asc(root.get("id")));
            return p;
        }, pageable);
        return cpu;
    }

    @GetMapping("/api/cpu/{CpuID}")
    public CentralProcessor SearchById(@PathVariable("CpuID") String id, @CookieValue(value = "username", required = false) String username) {
        CentralProcessor cpu = cpuRepository.findByID(id);
        try {
            User user = userRepository.findUserByUsername(username);
            if(user != null) {
                userActivityRepository.save(new UserActivity(user, "view", cpu.getId()));
                cpuRepository.update(id);
            }

            cpu.setCpuRating(cpuRatingRepository.findById(user.getId() + "-" + id));
            logger.log(ClientLevel.CLIENT, "Success");
            return cpu;

        } catch (Exception e) {
            logger.log(ClientLevel.CLIENT, "Unsuccess");
            return cpu;
        }
    }
}
