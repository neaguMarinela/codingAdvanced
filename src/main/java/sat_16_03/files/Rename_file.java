package sat_16_03.files;

import java.io.File;

public class Rename_file {
   public static void main(String[] args) {
      File oldName = new File("/Users/marinela.neagu" +
              "/SDA/codingAdvanced/Java.txt");
      //File oldName = new File("D:/java.txt");
      File newName = new File("/Users/marinela.neagu" +
              "/SDA/codingAdvanced/Java2.txt");
      //File newName = new File("D:/program.txt");

      if(oldName.renameTo(newName)) {
         System.out.println("renamed");
      } else {
         System.out.println("Error");
      }
   }
}