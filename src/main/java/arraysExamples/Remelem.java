package arraysExamples;

import java.util.ArrayList;

public class Remelem {
   public static void main(String[] args) {
      ArrayList objArray = new ArrayList();
      objArray.clear();
      objArray.add(0,"0th element");
      objArray.add(1,"1st element");
      objArray.add(2,"2nd element");
      System.out.println("Array before removing an element"+objArray);
      objArray.remove(1);
      objArray.remove("0th element");
      System.out.println("Array after removing an element"+objArray);
   }
}