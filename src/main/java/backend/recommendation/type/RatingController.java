package backend.recommendation.type;

import backend.recommendation.type.rating.CpuRating;
import backend.recommendation.type.rating.GpuRating;
import backend.recommendation.type.rating.HddRating;
import backend.recommendation.type.rating.MainboardRating;
import backend.recommendation.type.rating.PsuRating;
import backend.recommendation.type.rating.RamRating;
import backend.recommendation.type.rating.RetailerRating;
import backend.recommendation.type.rating.SsdRating;
import backend.recommendation.type.repository.CpuRatingRepository;
import backend.recommendation.type.repository.GpuRatingRepository;
import backend.recommendation.type.repository.HddRatingRepository;
import backend.recommendation.type.repository.MainRatingRepository;
import backend.recommendation.type.repository.PsuRatingRepository;
import backend.recommendation.type.repository.RamRatingRepository;
import backend.recommendation.type.repository.SsdRatingRepository;
import backend.retailer.RetailerRatingRepository;
import backend.security.model.AuthenticationResponse;
import backend.user.User;
import backend.user.UserActivity;
import backend.user.UserActivityRepository;
import backend.user.UserRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class RatingController {

    private static final Logger logger = LogManager.getLogger(RatingController.class);;

    private final CpuRatingRepository cpuRatingRepository;
    private final GpuRatingRepository gpuRatingRepository;
    private final MainRatingRepository mainRatingRepository;
    private final RamRatingRepository ramRatingRepository;
    private final SsdRatingRepository ssdRatingRepository;
    private final HddRatingRepository hddRatingRepository;
    private final PsuRatingRepository psuRatingRepository;
    private final RetailerRatingRepository retailerRatingRepository;
    private final UserRepository userRepository;
    private final UserActivityRepository userActivityRepository;

    public RatingController(CpuRatingRepository cpuRatingRepository,
                            GpuRatingRepository gpuRatingRepository,
                            MainRatingRepository mainRatingRepository,
                            RamRatingRepository ramRatingRepository,
                            SsdRatingRepository ssdRatingRepository,
                            HddRatingRepository hddRatingRepository,
                            PsuRatingRepository psuRatingRepository, RetailerRatingRepository retailerRatingRepository, UserRepository userRepository, UserActivityRepository userActivityRepository) {
        this.cpuRatingRepository = cpuRatingRepository;
        this.gpuRatingRepository = gpuRatingRepository;
        this.mainRatingRepository = mainRatingRepository;
        this.ramRatingRepository = ramRatingRepository;
        this.ssdRatingRepository = ssdRatingRepository;
        this.hddRatingRepository = hddRatingRepository;
        this.psuRatingRepository = psuRatingRepository;
        this.retailerRatingRepository = retailerRatingRepository;
        this.userRepository = userRepository;
        this.userActivityRepository = userActivityRepository;
    }

    @PostMapping("/user/rating/cpu")
    public ResponseEntity<?> rating(@RequestBody CpuRating cpuRating, @CookieValue(value = "username", required = false) String username) {
        cpuRatingRepository.save(cpuRating);
        updateLog(username, cpuRating.getCentralProcessor(), cpuRating.getRating() + " star");
        return ResponseEntity.ok(new AuthenticationResponse("Rated"));
    }

    @PostMapping("/user/rating/ssd")
    public ResponseEntity<?> rating(@RequestBody SsdRating ssdRating, @CookieValue(value = "username", required = false) String username) {
        ssdRatingRepository.save(ssdRating);
        updateLog(username, ssdRating.getSsd(), ssdRating.getRating() + " star");
        return ResponseEntity.ok(new AuthenticationResponse("Rated"));
    }

    @PostMapping("/user/rating/gpu")
    public ResponseEntity<?> rating(@RequestBody GpuRating gpuRating, @CookieValue(value = "username", required = false) String username) {
        gpuRatingRepository.save(gpuRating);
        updateLog(username, gpuRating.getGraphicProcessor(), gpuRating.getRating() + " star");
        return ResponseEntity.ok(new AuthenticationResponse("Rated"));
    }

    @PostMapping("/user/rating/mainboard")
    public ResponseEntity<?> rating(@RequestBody MainboardRating mainboardRating, @CookieValue(value = "username", required = false) String username) {
        mainRatingRepository.save(mainboardRating);
        updateLog(username, mainboardRating.getMainboard(), mainboardRating.getRating() + " star");
        return ResponseEntity.ok(new AuthenticationResponse("Rated"));
    }

    @PostMapping("/user/rating/ram")
    public ResponseEntity<?> rating(@RequestBody RamRating ramRating, @CookieValue(value = "username", required = false) String username) {
        ramRatingRepository.save(ramRating);
        updateLog(username, ramRating.getRam(), ramRating.getRating() + " star");
        return ResponseEntity.ok(new AuthenticationResponse("Rated"));
    }

    @PostMapping("/user/rating/hdd")
    public ResponseEntity<?> rating(@RequestBody HddRating hddRating, @CookieValue(value = "username", required = false) String username) {
        hddRatingRepository.save(hddRating);
        updateLog(username, hddRating.getHdd(), hddRating.getRating() + " star");
        return ResponseEntity.ok(new AuthenticationResponse("Rated"));
    }

    @PostMapping("/user/rating/psu")
    public ResponseEntity<?> rating(@RequestBody PsuRating psuRating, @CookieValue(value = "username", required = false) String username) {
        psuRatingRepository.save(psuRating);
        updateLog(username, psuRating.getPsu(), psuRating.getRating() + " star");
        return ResponseEntity.ok(new AuthenticationResponse("Rated"));
    }

    @PostMapping("/user/rating/retailer")
    public ResponseEntity<?> rating(@RequestBody RetailerRating retailerRating, @CookieValue(value = "username", required = false) String username) {
        retailerRatingRepository.save(retailerRating);
        return ResponseEntity.ok(new AuthenticationResponse("Rated"));
    }

    void updateLog(String username, String componentId, String rating) {
        User user = userRepository.findUserByUsername(username);
        if(user != null) {
            userActivityRepository.save(new UserActivity(user, "rate " + rating, componentId));
        }
    }
}
