package sat_16_03.files;

import java.io.File;

public class File_set_opt {
   public static void main(String[] args) {
      File file = new File("/Users/marinela.neagu/SDA/codingAdvanced/Java.txt");
      System.out.println(file.setReadOnly());
      System.out.println(file.canWrite());
      //System.out.println(file.setWritable(true));
   }
}