package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
   public static void main(String[] args) {
      try (BufferedReader br = new BufferedReader(
         new FileReader("/Users/marinela.neagu/" +
                 "SDA/codingAdvanced/Java.txt"))) {
         String sCurrentLine;
         while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			} 
      } catch (IOException e) {
         e.printStackTrace();
      } 
   }
}  