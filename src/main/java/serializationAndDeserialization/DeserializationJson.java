package serializationAndDeserialization;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.JSONObject;
import org.json.XML;

public class DeserializationJson {
    public static void main(String[] args) {
        String json ="{\"oras\":\"Timisoara\",\"tara\":\"Romania\",\"numarCasa\":\"13\",\"jud\":\"Timis\",\n" +
                "\"sat\":\"Remetea\",\"str\":\"Principala\",\"comuna\":\"Remetea\",\"codPostal\":\"1000\"}";
        Gson gson = new GsonBuilder().create();
        Address address=gson.fromJson(json, Address.class);
        System.out.println("JSON: " + address.toString());

        JSONObject json2 = new JSONObject(json);
        String xml = XML.toString(json2);
        System.out.println("XML: " + xml);
    }
}
