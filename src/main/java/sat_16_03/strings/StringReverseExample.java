package sat_16_03.strings;

import java.lang.StringBuffer;

public class StringReverseExample{
   public static void main(String[] args) {
      String string = "marinela";
      String reverse = new StringBuffer(string).reverse().toString();
      System.out.println("\nString before reverse: "+string);
      System.out.println("String after reverse: "+reverse);
   }
}