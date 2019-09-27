package datetime;

import java.util.Calendar;
import java.util.Formatter;

public class Disp_mon {
   public static void main(String args[]) {
      Formatter fmt;
      Calendar cal = Calendar.getInstance();
      fmt = new Formatter();
      fmt.format("%tB %tb %tm", cal, cal, cal);
      System.out.println(fmt);
   }
}