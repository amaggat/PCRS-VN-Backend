package backend.chatbot.model;

import backend.pc.cpu.CentralProcessor;

import java.util.ArrayList;
import java.util.List;

public class ResponseModel {
    private String response = new String();
    private List responseList = new ArrayList();

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public List getResponseList() {
        return responseList;
    }

    public void setResponseList(List responseList) {
        this.responseList = responseList;
    }
}
