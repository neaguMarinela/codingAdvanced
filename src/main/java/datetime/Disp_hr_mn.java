package datetime;

import java.util.Calendar;
import java.util.Formatter;

public class Disp_hr_mn {
   public static void main(String args[]) {
      Formatter fmt;
      Calendar cal = Calendar.getInstance();
      fmt = new Formatter();
      fmt.format("%tl:%tM", cal, cal);
      System.out.println(fmt);
   }
}