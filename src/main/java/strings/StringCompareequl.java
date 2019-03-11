package strings;

public class StringCompareequl{
   public static void main(String []args){
      String s1 = "naveenkumar";
      String s2 = "naveenkumar";
      String s3 = new String ("naveen kumar");
      System.out.println(s1.equals(s2));
      System.out.println(s2.equals(s3));
   }
}