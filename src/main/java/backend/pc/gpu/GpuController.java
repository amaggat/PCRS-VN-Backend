package backend.pc.gpu;

import backend.pc.cpu.CpuController;
import backend.security.model.AuthenticationRequest;
import backend.security.model.AuthenticationResponse;
import backend.security.utils.JwtUtils;
import backend.user.User;
import backend.user.UserActivity;
import backend.user.UserActivityRepository;
import backend.user.UserRepository;
import backend.util.ClientLevel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.Predicate;
import java.util.Objects;

@RestController
public class GpuController {

    private static final Logger logger = LogManager.getLogger(GpuController.class);

    @Autowired
    private JwtUtils jwtUtil;
    private final UserActivityRepository userActivityRepository;
    private final UserRepository userRepository;

    private final GpuRepository gpuRepository;

    public GpuController(UserActivityRepository userActivityRepository, UserRepository userRepository, GpuRepository gpuRepository) {
        this.userActivityRepository = userActivityRepository;
        this.userRepository = userRepository;
        this.gpuRepository = gpuRepository;
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
            if(user != null) {
                userActivityRepository.save(new UserActivity(user, "view", gpu.getId()));
                gpuRepository.update(id);
            }
            logger.log(ClientLevel.CLIENT, "Success");
            return gpu;

        } catch (Exception e) {
            logger.log(ClientLevel.CLIENT, "Unsuccess");
            return gpu;
        }
    }

}
