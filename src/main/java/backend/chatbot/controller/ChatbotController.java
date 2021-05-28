package backend.chatbot.controller;

import backend.chatbot.model.RequestModel;
import backend.chatbot.model.ResponseModel;
import backend.chatbot.service.ChatbotService;
import backend.util.Chatbot;
import backend.util.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatbotController {

    @Autowired
    ChatbotService chatbotService;

    @PostMapping("user/chatbot")
    public ResponseModel response(@RequestBody RequestModel requestModel, @CookieValue("userId") Integer id) {
        String request = requestModel.getContent().toLowerCase();
        ResponseModel responseModel = returnResponseModel(request, id);
        return responseModel;
    }

    private ResponseModel returnResponseModel(String request, Integer id) {
        Chatbot content = new Chatbot();
        try {
            content = Utility.returnContent(request);
            System.out.println(content.getTag() + " " + content.getContent());
        } catch (Exception e) {

        }
        ResponseModel responseModel = new ResponseModel();
        responseModel.setResponse(content.getContent());

        switch (content.getTag()) {
            case "Cpu recommend":
                responseModel.setResponseList(chatbotService.returnRecommendList(id, "cpu", "cpu"));
                break;
            case "Gpu recommend":
                responseModel.setResponseList(chatbotService.returnRecommendList(id, "gpu", "video-card"));
                break;
            case "Mainboard recommend":
                responseModel.setResponseList(chatbotService.returnRecommendList(id, "mainboard", "motherboard"));
                break;
            case "Ram recommend":
                responseModel.setResponseList(chatbotService.returnRecommendList(id, "ram", "memory"));
                break;
            case "Ssd recommend":
                responseModel.setResponseList(chatbotService.returnRecommendList(id, "ssd", "ssd"));
                break;
            case "Hdd recommend":
                responseModel.setResponseList(chatbotService.returnRecommendList(id, "hdd", "hdd"));
                break;
            case "Psu recommend":
                responseModel.setResponseList(chatbotService.returnRecommendList(id, "psu", "power"));
                break;
        }

        return responseModel;
    }


}
