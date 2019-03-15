package sun_17_03.strings;

public class StringReplaceEmp{
   public static void main(String args[]){
      String str = "Hello World Hello Java";
      System.out.println( str.replace( 'H','W' ) );
      System.out.println( str.replaceFirst("He", "Wa") );
      System.out.println( str.replaceAll("He", "Ha") );
   }
}