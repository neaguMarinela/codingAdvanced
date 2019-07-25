package files;

import java.io.File;

public class File_set_opt {
   public static void main(String[] args) {
      File file = new File("/Users/marinela.n" +
              "eagu/SDA/codingAdvanced/Java.txt");
      System.out.println(file.setReadOnly());
      System.out.println(file.canWrite());
      System.out.println(file.setWritable(true));
   }
}