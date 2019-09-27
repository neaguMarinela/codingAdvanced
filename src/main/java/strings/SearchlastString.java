package strings;

public class SearchlastString {
   public static void main(String[] args) {
      //String strOriginal = "Hello world ,Hello Reader Hello";
      String strOriginal = " world  Reader";
      int lastIndex = strOriginal.lastIndexOf("Hello");
      
      if(lastIndex == - 1){
         System.out.println("Hello not found");
      } else {
         System.out.println("Last occurrence of Hello" +
                 " is at index "+ lastIndex);
      }
   }
}