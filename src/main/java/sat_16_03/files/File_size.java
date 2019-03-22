package sat_16_03.files;

import java.io.File;

public class File_size {
   public static long getFileSize(String filename) {
      File file = new File(filename);
      if (!file.exists() || !file.isFile()) {
         System.out.println("File doesn't exist");
         return -1;
      }
      return file.length();
   }
   public static void main(String[] args) {
      long size = getFileSize("/Users/marinela" +
              ".neagu/SDA/codingAdvanced/Java.txt");
      System.out.println("File size in bytes: " + size);
   }
}