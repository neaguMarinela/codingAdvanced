package sat_16_03.files;

import java.io.File;

public class File_tmp {
   public static void main(String[] args) throws Exception {
      File file;
      //File dir = new File("C:/");
      File file1 = new File("/Users/marinela.neagu/" +
              "SDA/codingAdvanced/");
      file = File.createTempFile("JavaTemp", ".txt",
              file1);
      System.out.println(file.getPath());
   }
}