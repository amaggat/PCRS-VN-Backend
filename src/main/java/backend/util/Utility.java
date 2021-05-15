package backend.util;

import backend.model.ElectronicComponents;
import backend.pcprofile.PcProfile;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Utility {

    public static List<String> returnPcProfileID(List<PcProfile> pcProfileList) {
        List<String> profileId = new ArrayList<>();

        for (PcProfile pcProfile : pcProfileList) {
            profileId.add(pcProfile.getId());
        }

        return profileId;
    }

    public static List<String> returnComponentIdList(List<ElectronicComponents> electronicComponentsList) {
        List<String> componentId = new ArrayList<>();

        for (ElectronicComponents electronicComponents : electronicComponentsList) {
            componentId.add(electronicComponents.getId());
        }

        return componentId;
    }

    public static Result returnReccomendedItem(String linkQueries, String type, String typeValue, String value, Integer id) throws IOException {
        HttpURLConnection con = setConnection(linkQueries);
        String jsonInputString = new String();
        if(id != null) {
            jsonInputString = toJsonStringUser(type, typeValue, value, id);
        }
        else {
            jsonInputString = toJsonString(type, typeValue, value);
        }
        System.out.println(jsonInputString);
        doPost(con, jsonInputString);
        Result result = outJsonResponse(con);
        return result;
    }

    public static void sendActivity(String linkQueries, String action, Integer userid, String item) throws IOException {
        HttpURLConnection con = setConnection(linkQueries);
        String jsonInputString = toJsonRequest(action, userid, item);
        doPost(con, jsonInputString);
    }

    public static Result outJsonResponse(HttpURLConnection con) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"))){
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            Gson gson = new Gson();
            Result result = gson.fromJson(response.toString(), Result.class);

            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new Result();
    }

    public static HttpURLConnection setConnection(String path) throws IOException {
        URL url = new URL (path);

        HttpURLConnection con = (HttpURLConnection)url.openConnection();
        con.setRequestMethod("POST");

        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Accept", "application/json");

        con.setDoOutput(true);
        return con;
    }



    public static void doPost(HttpURLConnection con, String jsonInputString) throws IOException {
        try(OutputStream os = con.getOutputStream()){
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int code = con.getResponseCode();
        System.out.println(code);
    }




    public static String toJsonRequest(String action, Integer userid, String item) {
        String jsonInputString = "{\n" +
                "    \"event\": \""+ action + "\",\n" +
                "    \"entityType\": \""+ "user" + "\",\n" +
                "    \"entityId\": \""+ userid +"\",\n" +
                "    \"targetEntityType\": \"" + "item" + "\",\n" +
                "    \"targetEntityId\": \""+ item + "\",\n" +
                "    \"properties\": \" { }\",\n" +
                "    \"eventTime\": \""+ LocalDateTime.now()+"Z" + "\"\n" +
                "}";
        return jsonInputString;
    }

    public static String toJsonString(String type, String typeValue, String value) {
        String jsonInputString = new String();

        jsonInputString = "{\n" +
                "    \"" + type + "\": \""+ typeValue +"\",\n" +
                "    \"rules\": [\n" +
                "    {\n" +
                "      \"name\": \"category\",\n" +
                "      \"values\": [\""+ value+ "\"],\n" +
                "      \"bias\": -1\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        return jsonInputString;
    }

    public static String toJsonStringUser(String type, String typeValue, String value, Integer id) {
        String jsonInputString = new String();

        jsonInputString = "{\n" +
                "    \"" + type + "\": \""+ typeValue +"\",\n" +
                "    \"user\": \""+ id +"\",\n" +
                "    \"rules\": [\n" +
                "    {\n" +
                "      \"name\": \"category\",\n" +
                "      \"values\": [\""+ value+ "\"],\n" +
                "      \"bias\": -1\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        return jsonInputString;
    }
}
