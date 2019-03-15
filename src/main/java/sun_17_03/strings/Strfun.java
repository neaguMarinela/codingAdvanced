package sun_17_03.strings;

public class Strfun {
   public static void main(String []args) {
      String s = "Hello"; 
	  String s1 ="This World is crazy";
	  String[] temp = s1.split("\\s"); 
      s = s.concat(" marinela");
      System.out.print(s);
 	  System.out.println("");
	  for(int i = 0; i < temp.length; i++) {
         System.out.println(temp[i]);
         System.out.println("");
	  }
   }
}