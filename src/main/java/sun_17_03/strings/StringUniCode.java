package sun_17_03.strings;

public class StringUniCode {
   public static void main(String[] args) {
      String test_string = "Welcome to Java world";
      System.out.println("String under test is = "+test_string);
      
      System.out.println("Unicode code point at" 
         +" position 5 in the string is = "
         +  test_string.codePointBefore(5));
   }
}