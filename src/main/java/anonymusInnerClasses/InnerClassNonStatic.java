package anonymusInnerClasses;

class OuterClass {
   int num;
   
   // private inner class has name
   private class InnerClass {
      public void print() {
         System.out.println("This is an inner class");
      }
   }
   
   // Accessing the inner class from within the method 
   void displayInnerClass() {
      InnerClass inner = new InnerClass();
      inner.print();
   }
}	

public class InnerClassNonStatic {
	
	public static void main(String[] args) {
	  // Instantiating the outer class 
      OuterClass outer = new OuterClass();
      
      // Accessing the displayInnerClass() method
      outer.displayInnerClass();
	}
}
