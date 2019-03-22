package sat_16_03.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileExample {
   public static void main(String[] args) {
      try {
         String content = "java is one of the best language in " +
                 "the world";
         File file = new File("/Users/marinela.neagu/SDA" +
                 "/codingAdvanced/Java.txt");
         if (!file.exists()) {
            file.createNewFile();
         } 
         FileWriter fw = new FileWriter(file.getAbsoluteFile());
         BufferedWriter bw = new BufferedWriter(fw);
         bw.write(content);
         bw.close();
         System.out.println("Done");
      } catch (IOException e) {
         e.printStackTrace();
      } 
   } 
}