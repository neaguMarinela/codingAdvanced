package datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cls_mmmm {
   public static void main(String[] args) {
      Date date = new Date();
      SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
      System.out.println("Current Month in MMMM format : " + sdf.format(date));
   }
}