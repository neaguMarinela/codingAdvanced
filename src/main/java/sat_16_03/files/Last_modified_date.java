package sat_16_03.files;

import java.io.File;
import java.util.Date;

public class Last_modified_date {
   public static void main(String[] args) {
      File file = new File("/Users/marinela.neagu/SDA/codingAdvanced/Java.txt");
      Long lastModified = file.lastModified();
      System.out.println(lastModified);
      Date date = new Date(lastModified);
      System.out.println(date);
   }
}