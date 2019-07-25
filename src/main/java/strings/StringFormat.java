package strings;

import java.util.*;

public class StringFormat{
   public static void main(String[] args){
      double e = Math.E;
      System.out.format("%f%n", e);
      //https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
      System.out.format(Locale.GERMANY, "%-10.4f%n%n", e);
   }
}