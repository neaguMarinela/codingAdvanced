package sat_16_03.files;

import java.io.File;

public class Compare_path
{
   public static void main(String[] args) 
   {
      //File file1 = new File("C:/File/demo1.txt");
      //File file2 = new File("C:/java/demo1.txt");

       File file1 = new File("/Users/marinela.neagu/SDA/codingAdvanced/Java.txt");
       File file2 = new File("/Users/marinela.neagu/SDA/codingAdvanced/Java.txt");

      if(file1.compareTo(file2) == 0) 
	  {
         System.out.println("Both paths are same!");
      } 
	  else 
	  {
         System.out.println("Paths are not same!");
      }
   }
}