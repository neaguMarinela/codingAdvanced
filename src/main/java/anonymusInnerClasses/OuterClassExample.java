package anonymusInnerClasses;

abstract class AnonymousInner { //or interface
    public abstract void myMethod();
}

public class OuterClassExample {

	public static void main(String args[]) {
      
		AnonymousInner inner = new AnonymousInner() {
			 
			 @Override
	         public void myMethod() {
	            System.out.println("This is an example of anonymous inner class. It does not need to use extends or implement keywords so as to define a separate class");
	         }
      };
      
      inner.myMethod();	
    }

}
