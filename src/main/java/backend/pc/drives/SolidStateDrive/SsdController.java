package backend.pc.drives.SolidStateDrive;

import backend.pc.cpu.CpuController;
import backend.pc.ram.Ram;
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
public class SsdController {

    private static final Logger logger = LogManager.getLogger(SsdController.class);

    @Autowired
    private JwtUtils jwtUtil;
    private final UserActivityRepository userActivityRepository;
    private final UserRepository userRepository;
    private final SsdRepository ssdRepository;

    public SsdController(UserActivityRepository userActivityRepository, UserRepository userRepository, SsdRepository ssdRepository) {
        this.userActivityRepository = userActivityRepository;
        this.userRepository = userRepository;
        this.ssdRepository = ssdRepository;
    }

    @GetMapping("/api/ssd")
    public Page<SolidStateDrive> list(@RequestParam(name = "name", required = false) String name,
                                      @RequestParam(name = "chipset", required = false) String chipset,
                                      @RequestParam(name = "manufacturer", required = false) String manufacturer,
                                      @RequestParam(name = "storage", required = false) String storage,
                                      Pageable pageable) {
        Page<SolidStateDrive> ssd = ssdRepository.findAll((Specification<SolidStateDrive>) (root, cq, cb) -> {
            Predicate p = cb.conjunction();
            if (Objects.nonNull(chipset)) {
                p = cb.and(p, cb.like(root.get("chipset"), "%" + chipset + "%"));
            }
            if (Objects.nonNull(manufacturer)) {
                p = cb.and(p, cb.like(root.get("manufacturer"), "%" + manufacturer + "%"));
            }
            if (Objects.nonNull(storage)) {
                p = cb.and(p, cb.like(root.get("storage"), "%" + storage + "%"));
            }
            if (!StringUtils.isEmpty(name)) {
                p = cb.and(p, cb.like(root.get("fullname"), "%" + name + "%"));
            }
            cq.orderBy(cb.desc(root.get("fullname")), cb.asc(root.get("id")));
            return p;
        }, pageable);
        return ssd;
    }

    @GetMapping("/api/ssd/{id}")
    public SolidStateDrive SearchById(@PathVariable("id") String id, @RequestBody AuthenticationResponse jwt) {
        SolidStateDrive ssd = ssdRepository.findByID(id);

        try {
            String username = jwtUtil.extractUsername(jwt.getJwt());
            User user = userRepository.findUserByUsername(username);
            if(user != null) {
                userActivityRepository.save(new UserActivity(user, "view", ssd.getId()));
                ssdRepository.update(id);
            }
            logger.log(ClientLevel.CLIENT, "Success");
            return ssd;

        } catch (Exception e) {
            logger.log(ClientLevel.CLIENT, "Unsuccess");
            return ssd;
        }
    }

}
