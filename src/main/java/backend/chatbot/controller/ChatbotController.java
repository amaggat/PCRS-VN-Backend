package backend.chatbot.controller;

import backend.chatbot.model.RequestModel;
import backend.chatbot.model.Resources;
import backend.chatbot.model.ResponseModel;
import backend.chatbot.service.ChatbotService;
import backend.pc.cpu.CpuController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

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
        ResponseModel responseModel = new ResponseModel();
        responseModel.setResponse("IMO, you should see ");

        switch (request) {
            case "hello":
            case "hi":
                responseModel.setResponse(Resources.chooseRandom(Resources.GREETINGS));
                break;
            case "recommend me some cpu":
                responseModel.setResponseList(chatbotService.returnRecommendList(id, "cpu", "cpu"));
                break;
            case "recommend me some gpu":
                responseModel.setResponseList(chatbotService.returnRecommendList(id, "gpu", "video-card"));
                break;
            case "recommend me some mainboard":
                responseModel.setResponseList(chatbotService.returnRecommendList(id, "mainboard", "motherboard"));
                break;
            case "recommend me some ram":
                responseModel.setResponseList(chatbotService.returnRecommendList(id, "ram", "memory"));
                break;
            case "recommend me some ssd":
                responseModel.setResponseList(chatbotService.returnRecommendList(id, "ssd", "ssd"));
                break;
            case "recommend me some hdd":
                responseModel.setResponseList(chatbotService.returnRecommendList(id, "hdd", "hdd"));
                break;
            case "recommend me some psu":
                responseModel.setResponseList(chatbotService.returnRecommendList(id, "psu", "power"));
                break;
        }

        return responseModel;
    }


}
