package datetime;

import java.util.Calendar;
import java.util.Formatter;

public class Curr_dt_tm {
   public static void main(String args[]) {
      Formatter fmt;
      Calendar cal = Calendar.getInstance();
      fmt = new Formatter();
      fmt.format("%tc", cal);
      System.out.println(fmt);
   }
}