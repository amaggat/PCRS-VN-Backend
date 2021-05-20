package backend.chatbot.service;

import backend.pc.cpu.CentralProcessor;
import backend.pc.cpu.CpuRepository;
import backend.pc.drives.HardDriveDisk.HddRepository;
import backend.pc.drives.SolidStateDrive.SsdRepository;
import backend.pc.gpu.GpuRepository;
import backend.pc.mainboard.MainRepository;
import backend.pc.psu.PsuRepository;
import backend.pc.ram.RamRepository;
import backend.util.Recommender;
import backend.util.Result;
import backend.util.Utility;
import javafx.util.Pair;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChatbotServiceImpl implements ChatbotService{

    private final CpuRepository cpuRepository;
    private final GpuRepository gpuRepository;
    private final MainRepository mainRepository;
    private final RamRepository ramRepository;
    private final SsdRepository ssdRepository;
    private final HddRepository hddRepository;
    private final PsuRepository psuRepository;


    public ChatbotServiceImpl(CpuRepository cpuRepository, GpuRepository gpuRepository, MainRepository mainRepository, RamRepository ramRepository, SsdRepository ssdRepository, HddRepository hddRepository, PsuRepository psuRepository) {
        this.cpuRepository = cpuRepository;
        this.gpuRepository = gpuRepository;
        this.mainRepository = mainRepository;
        this.ramRepository = ramRepository;
        this.ssdRepository = ssdRepository;
        this.hddRepository = hddRepository;
        this.psuRepository = psuRepository;
    }

    public List returnRecommendList(Integer id, String type) {
        List recommendList = new ArrayList();
        try {
            Result result = Utility.returnReccomendedItem(null, type, id);
            recommendList = getComponentId(result, type);
        } catch (Exception e) {
            return recommendList;
        }

        return recommendList;
    }

   private List getComponentId(Result result, String type) {
        List componentId = new ArrayList();
        for (int i = 0; i <2; ++i) {
            Recommender recommender = result.getResult().get(i);
            String link = "http://localhost:3000/products/" + type + "/" + recommender.getItem();
            Pair<String, String> product = new Pair<>(getComponentName(recommender, type), link);
            componentId.add(product);
        }

        return componentId;
   }

   private String getComponentName(Recommender recommender, String type) {
        String componentName = new String();
        switch (type){
            case "cpu":
                componentName = cpuRepository.findByID(recommender.getItem()).getFullname();
                break;
            case "gpu":
                componentName = gpuRepository.findByID(recommender.getItem()).getFullname();
                break;
            case "mainboard":
                componentName = mainRepository.findByID(recommender.getItem()).getFullname();
                break;
            case "ram":
                componentName = ramRepository.findByID(recommender.getItem()).getFullname();
                break;
            case "ssd":
                componentName = ssdRepository.findByID(recommender.getItem()).getFullname();
                break;
            case "hdd":
                componentName = hddRepository.findByID(recommender.getItem()).getFullname();
                break;
            case "psu":
                componentName = psuRepository.findByID(recommender.getItem()).getFullname();
                break;
        }
        return componentName;
   }

}
