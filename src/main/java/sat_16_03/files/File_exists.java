package sat_16_03.files;

import java.io.File;
import java.io.IOException;

public class File_exists {
   public static void main(String[] args) {
      try {
         File file = new File("/Users/marinela.neagu/SDA/codingAdvanced/Java.txt");
         
         if(file.createNewFile())System.out.println("Success!");
         else System.out.println ("Error, file already exists.");
      }
      catch(IOException ioe) {
         ioe.printStackTrace();
      }
   }
}