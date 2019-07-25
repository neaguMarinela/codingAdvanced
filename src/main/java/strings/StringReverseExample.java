package strings;

public class StringReverseExample{
   public static void main(String[] args) {
      String stringMarinela = "marinela";
      StringBuilder input1 = new StringBuilder();

      // append a string into StringBuilder input1
      input1.append(stringMarinela);

      // reverse StringBuilder input1
      input1 = input1.reverse();

      System.out.println("\nString before reverse: "+stringMarinela);
      System.out.println("String after reverse: "+input1);
   }
}