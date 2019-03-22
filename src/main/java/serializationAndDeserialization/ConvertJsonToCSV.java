package serializationAndDeserialization;

import org.apache.commons.io.FileUtils;
import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;

public class ConvertJsonToCSV {
    public static void main(String[] args) {
        //https://dzone.com/articles/how-to-convert-csv-to-json-in-java

        String jsonArrayString = "{\"fileName\": [{\"name\": \"Anand\",\"last\": \"Dwivedi\",\"place\": \"Bangalore\"}]}";
        JSONObject output;
        try {
            output = new JSONObject(jsonArrayString);
            JSONArray docs = output.getJSONArray("fileName");

            File file=new File("/Users/marinela.neagu/SDA/codingAdvanced/Java.csv");
            file.createNewFile();
            String csv = CDL.toString(docs);
            FileUtils.writeStringToFile(file, csv);
            System.out.println("Data has been Successfully Written to "+file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
