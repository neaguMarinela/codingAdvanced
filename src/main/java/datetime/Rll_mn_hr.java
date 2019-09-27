package datetime;

import java.util.Calendar;
import java.util.Date;

public class Rll_mn_hr {
    public static void main(String[] args) throws Exception {
        Date d1 = new Date();
        Calendar cl = Calendar.getInstance();

        cl.setTime(d1);
        System.out.println("today is " + d1.toString());

        cl.roll(Calendar.MONTH, 1);
        System.out.println("date after a month will be " + cl.getTime().toString());

        cl.roll(Calendar.HOUR, 7);
        System.out.println("date after 7 hrs will be " + cl.getTime().toString());
    }
}