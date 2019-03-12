package sat_16_03.files;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class AppendToFileExample {
   public static void main( String[] args ) { 
      try { 
         String data = "Hello world";
         //File f1 = new File("D:\\abc.txt");
         File f1 = new File("/Users/marinela.neagu/SDA/codingAdvanced/Java.txt");
         if(!f1.exists()) {
            f1.createNewFile();
         } 
         FileWriter fileWritter = new FileWriter(f1.getAbsoluteFile(),true);
         BufferedWriter bw = new BufferedWriter(fileWritter);
         bw.write(data);
         bw.close();
         System.out.println("Done");
      } catch(IOException e){
         e.printStackTrace();
      }
   }
}