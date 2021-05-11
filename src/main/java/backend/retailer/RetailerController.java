package backend.retailer;

import backend.pc.ram.RamController;
import backend.user.User;
import backend.user.UserActivity;
import backend.user.UserActivityRepository;
import backend.user.UserRepository;
import backend.util.ClientLevel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.Predicate;

@RestController
public class RetailerController {

    private static final Logger logger = LogManager.getLogger(RetailerController.class);

    private final UserActivityRepository userActivityRepository;
    private final UserRepository userRepository;
    private final RetailerRepository retailerRepository;
    private final RetailerRatingRepository retailerRatingRepository;

    public RetailerController(UserActivityRepository userActivityRepository, UserRepository userRepository, RetailerRepository retailerRepository, RetailerRatingRepository retailerRatingRepository) {
        this.userActivityRepository = userActivityRepository;
        this.userRepository = userRepository;
        this.retailerRepository = retailerRepository;
        this.retailerRatingRepository = retailerRatingRepository;
    }

    @GetMapping("/api/retailer")
    public Page<Retailer> list(@RequestParam(name = "name", required = false) String name,
                               Pageable pageable) {
        Page<Retailer> retailers = retailerRepository.findAll((Specification<Retailer>) (root, cq, cb) -> {
            Predicate p = cb.conjunction();
            if (!StringUtils.isEmpty(name)) {
                p = cb.and(p, cb.like(root.get("name"), "%" + name + "%"));
            }
            cq.orderBy(cb.desc(root.get("name")), cb.asc(root.get("id")));
            return p;
        }, pageable);

        return retailers;
    }

    @GetMapping("/api/retailer/{retailerId}")
    public Retailer findByID(@PathVariable("retailerId") Integer id, @CookieValue(value = "username", required = false) String username) {
        Retailer retailer = retailerRepository.findByID(id);

        try {
            User user = userRepository.findUserByUsername(username);
            retailer.setRetailerRating(retailerRatingRepository.findById(user.getId() + "-" + id));
            logger.log(ClientLevel.CLIENT, "Success");
            return retailer;
        } catch (Exception e) {
            logger.log(ClientLevel.CLIENT, "Unsuccess");
            return retailer;
        }
    }

}
