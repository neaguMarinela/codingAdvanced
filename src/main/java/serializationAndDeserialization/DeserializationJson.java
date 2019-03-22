package serializationAndDeserialization;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.JSONObject;
import org.json.XML;

public class DeserializationJson {
    public static void main(String[] args) {
        String json ="{\"city\":\"Jos\",\"country\":\"Nigeria\",\"houseNumber\":\"13\",\"lga\":\"Jos South\",\n" +
                "\"state\":\"Plateau\",\"streetName\":\"Jonah Jann\",\"village\":\"Bukuru\",\"ward\":\"1\"}";
        Gson gson = new GsonBuilder().create();
        Address address=gson.fromJson(json, Address.class);
        System.out.println(address.toString());

        JSONObject json2 = new JSONObject(json);
        String xml = XML.toString(json2);
        System.out.println(xml);
    }
}
