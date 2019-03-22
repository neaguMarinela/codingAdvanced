package serializationAndDeserialization;

import com.google.gson.Gson;

public class SerializationJson {
    public static void main(String[] args) {

        UserSimple userObject = new UserSimple(
                "marinela",
                "marinela@sda.com",
                26,
                true
        );

        Gson gson = new Gson();

        String userJson = gson.toJson(userObject);

        System.out.println(userJson);
    }
}
