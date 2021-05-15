package backend.recommendation;

import backend.recommendation.type.repository.CpuRatingRepository;
import backend.recommendation.type.repository.GpuRatingRepository;
import backend.recommendation.type.repository.HddRatingRepository;
import backend.recommendation.type.repository.MainRatingRepository;
import backend.recommendation.type.repository.PsuRatingRepository;
import backend.recommendation.type.repository.RamRatingRepository;
import backend.recommendation.type.repository.SsdRatingRepository;
import org.springframework.stereotype.Service;

@Service
public class NeighborhoodService {

    private CpuRatingRepository cpuRatingRepository;
    private GpuRatingRepository gpuRatingRepository;
    private HddRatingRepository hddRatingRepository;
    private SsdRatingRepository ssdRatingRepository;
    private RamRatingRepository ramRatingRepository;
    private PsuRatingRepository psuRatingRepository;
    private MainRatingRepository mainRatingRepository;

    public NeighborhoodService(CpuRatingRepository cpuRatingRepository,
                               GpuRatingRepository gpuRatingRepository,
                               HddRatingRepository hddRatingRepository,
                               SsdRatingRepository ssdRatingRepository,
                               RamRatingRepository ramRatingRepository,
                               PsuRatingRepository psuRatingRepository,
                               MainRatingRepository mainRatingRepository) {
        this.cpuRatingRepository = cpuRatingRepository;
        this.gpuRatingRepository = gpuRatingRepository;
        this.hddRatingRepository = hddRatingRepository;
        this.ssdRatingRepository = ssdRatingRepository;
        this.ramRatingRepository = ramRatingRepository;
        this.psuRatingRepository = psuRatingRepository;
        this.mainRatingRepository = mainRatingRepository;
    }


}
