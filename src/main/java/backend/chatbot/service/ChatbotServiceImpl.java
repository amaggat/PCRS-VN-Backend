package backend.chatbot.service;

import backend.pc.cpu.CentralProcessor;
import backend.pc.cpu.CpuController;
import backend.pc.cpu.CpuRepository;
import backend.util.Recommender;
import backend.util.Result;
import backend.util.Utility;
import javafx.util.Pair;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ChatbotServiceImpl implements ChatbotService{

    private final CpuRepository cpuRepository;

    public ChatbotServiceImpl(CpuRepository cpuRepository) {
        this.cpuRepository = cpuRepository;
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

   public List getComponentId(Result result, String type) {
        List componentId = new ArrayList(Arrays.asList(
                new Pair<>("ProductID", "http://localhost:3000/products/"),
                new Pair<>("ProductID", "http://localhost:3000/products/"),
                new Pair<>("ProductID", "http://localhost:3000/products/")));

//        for (int i = 0; i <3; ++i) {
//           Recommender recommender = result.getResult().get(i);
//           componentId.add("http://localhost:3000/products/" + type + "/" + recommender.getItem());
//        }

        return componentId;
   }

}
