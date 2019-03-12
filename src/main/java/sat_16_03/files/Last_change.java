package sat_16_03.files;

import java.io.File;
import java.util.Date;

public class Last_change {
   public static void main(String[] args) throws Exception {
      File fileToChange = new File ("/Users/marinela.neagu/SDA/codingAdvanced/Java.txt");
      fileToChange.createNewFile();
      Date filetime = new Date (fileToChange.lastModified());
      System.out.println(filetime.toString());
      System.out.println (fileToChange.setLastModified (System.currentTimeMillis()));
      filetime = new Date (fileToChange.lastModified());
      System.out.println(filetime.toString());
   }
}