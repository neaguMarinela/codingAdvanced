package datetime;

import java.text.DateFormat;
import java.util.*;

public class Disp_tm_it {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println("today is " + d1.toString());
        Locale locItalian = new Locale("it");
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locItalian);
        System.out.println("today is " + df.format(d1));
    }
}