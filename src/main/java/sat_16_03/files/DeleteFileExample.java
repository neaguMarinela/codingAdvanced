package sat_16_03.files;

import java.io.File;

public class DeleteFileExample { 
   public static void main(String[] args) { 
      try { 
         File file = new File("/Users/marinela.neagu/SDA/codingAdvanced/java1.txt");
         if(file.delete()) { 
            System.out.println(file.getName() + " is deleted!");
         } else {
            System.out.println("Delete operation is failed.");
    		}
      } catch(Exception e) {
         e.printStackTrace();
      }
   }
}