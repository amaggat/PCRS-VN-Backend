package backend.chatbot.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Resources {

    public static final List<String> GREETINGS = new ArrayList<>(Arrays.asList(
            "Hello there, I am Partz, your Virtual Assistant, how may i help you?",
            "Hi, my name is Partz, what can i do for you?",
            "Greeting stranger, to see my service command, type '!commands'"
    ));

    public static final List<String> COMMANDS_LIST = new ArrayList<>(Arrays.asList(
            "Recommend me a CPU",
            "Recommend me a GPU",
            "Recommend me a Mainboard",
            "Recommend me a RAM",
            "Recommend me a HDD",
            "Recommend me a SSD",
            "Recommend me a PSU"
    ));

    public static final List<String> UNKNOWN_COMMAND = new ArrayList<>(Arrays.asList(
            "Sorry, I don't know what you want to do.",
            "Sorry, i can not do that, try '!commands' to see my services.",
            "I am sorry, can you change the subject?",
            "Pardon me, i don't understand what you said."
    ));

    public static final List<String> RECOMMEND_COMMAND = new ArrayList<>(Arrays.asList(
            "In my opinion, you should see:",
            "From your activities, I recommend you:",
            "Ez, you should check:",
            "In that case, try:"
    ));

    public static String chooseRandom(List<String> responseList) {
        int x = Math.abs(new Random().nextInt());
        String response = (responseList.get(x% responseList.size()));
        return response;
    }
}
