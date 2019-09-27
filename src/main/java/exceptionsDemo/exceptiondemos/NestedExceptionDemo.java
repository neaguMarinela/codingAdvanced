package exceptionsDemo.exceptiondemos;

/**
 * NestedExceptionDemo: illustrates how nested exceptions flow
 *
 *
 */
class NestedExceptionDemo {
    
	public static void main(String args[]) {
		 //Parent try block
	     try {
	    	 
	    	 //Child try block1
	         try {
	            System.out.println("Inside block1 try block");
	            int b = 45/0;
	            System.out.println(b);
	         }
	         catch (ArithmeticException e1) {
	            System.out.println("Exception: e1 try catch block");
	         }
	         
	         //Child try block2
	         try {
	            System.out.println("Inside block2 try block");
	            int b = 45/0;
	            System.out.println(b);
	         }
	         catch (ArrayIndexOutOfBoundsException e2) {
	            System.out.println("Exception: e2 try catch block");
	         }
	         
	         System.out.println("Just other statement in Parent try block");
	    }
	    catch(ArithmeticException e3) {
	        System.out.println("Arithmetic Exception");
	        System.out.println("Inside parent try catch block");
	    }
	    catch(ArrayIndexOutOfBoundsException e4) {
	    	System.out.println("ArrayIndexOutOfBoundsException");
	        System.out.println("Inside parent try catch block");
	    }
	    catch(Exception e5) {
	    	System.out.println("Generic Exception");
	        System.out.println("Inside parent try catch block");
	    }
	    System.out.println("Next statement in Parent..");
    }
}