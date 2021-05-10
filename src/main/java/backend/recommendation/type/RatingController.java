package backend.recommendation.type;

import backend.recommendation.type.rating.CpuRating;
import backend.recommendation.type.rating.GpuRating;
import backend.recommendation.type.rating.HddRating;
import backend.recommendation.type.rating.MainboardRating;
import backend.recommendation.type.rating.PsuRating;
import backend.recommendation.type.rating.RamRating;
import backend.recommendation.type.rating.SsdRating;
import backend.recommendation.type.repository.CpuRatingRepository;
import backend.recommendation.type.repository.GpuRatingRepository;
import backend.recommendation.type.repository.HddRatingRepository;
import backend.recommendation.type.repository.MainRatingRepository;
import backend.recommendation.type.repository.PsuRatingRepository;
import backend.recommendation.type.repository.RamRatingRepository;
import backend.recommendation.type.repository.SsdRatingRepository;
import backend.security.model.AuthenticationResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
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

    public RatingController(CpuRatingRepository cpuRatingRepository,
                            GpuRatingRepository gpuRatingRepository,
                            MainRatingRepository mainRatingRepository,
                            RamRatingRepository ramRatingRepository,
                            SsdRatingRepository ssdRatingRepository,
                            HddRatingRepository hddRatingRepository,
                            PsuRatingRepository psuRatingRepository) {
        this.cpuRatingRepository = cpuRatingRepository;
        this.gpuRatingRepository = gpuRatingRepository;
        this.mainRatingRepository = mainRatingRepository;
        this.ramRatingRepository = ramRatingRepository;
        this.ssdRatingRepository = ssdRatingRepository;
        this.hddRatingRepository = hddRatingRepository;
        this.psuRatingRepository = psuRatingRepository;
    }

    @GetMapping("/api/rating/{CpuID}")
    public Optional<HddRating> findById(@PathVariable("CpuID") String id) {
        return hddRatingRepository.findById(id);
    }

    @PostMapping("/user/rating/cpu")
    public ResponseEntity<?> rating(@RequestBody CpuRating cpuRating) {
        cpuRatingRepository.save(cpuRating);
        return ResponseEntity.ok(new AuthenticationResponse("Rated"));
    }

    @PostMapping("/user/rating/ssd")
    public ResponseEntity<?> rating(@RequestBody SsdRating ssdRating) {
        ssdRatingRepository.save(ssdRating);
        return ResponseEntity.ok(new AuthenticationResponse("Rated"));
    }

    @PostMapping("/user/rating/gpu")
    public ResponseEntity<?> rating(@RequestBody GpuRating cpuRating) {
        gpuRatingRepository.save(cpuRating);
        return ResponseEntity.ok(new AuthenticationResponse("Rated"));
    }

    @PostMapping("/user/rating/mainboard")
    public ResponseEntity<?> rating(@RequestBody MainboardRating mainboardRating) {
        mainRatingRepository.save(mainboardRating);
        return ResponseEntity.ok(new AuthenticationResponse("Rated"));
    }

    @PostMapping("/user/rating/ram")
    public ResponseEntity<?> rating(@RequestBody RamRating ramRating) {
        ramRatingRepository.save(ramRating);
        return ResponseEntity.ok(new AuthenticationResponse("Rated"));
    }

    @PostMapping("/user/rating/hdd")
    public ResponseEntity<?> rating(@RequestBody HddRating hddRating) {
        hddRatingRepository.save(hddRating);
        return ResponseEntity.ok(new AuthenticationResponse("Rated"));
    }

    @PostMapping("/user/rating/psu")
    public ResponseEntity<?> rating(@RequestBody PsuRating psuRating) {
        psuRatingRepository.save(psuRating);
        return ResponseEntity.ok(new AuthenticationResponse("Rated"));
    }

}
