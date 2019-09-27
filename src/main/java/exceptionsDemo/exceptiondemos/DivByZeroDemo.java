package exceptionsDemo.exceptiondemos;

/** 
 * un-checked exception demo, finally block is optional with try/catch block. 
 * Catch block is optional with try/finally block. Finally block always executes.
 * 
 * Default exception handling mechanism in Java. 
 * If you don't try/catch for an exception, then the JVM catches it.
 * 
 *
 */
public class DivByZeroDemo {
	public static void main(String args[]) {
       try {
    	   System.out.println("In main");
           System.out.println(10/0);
           System.out.println("After div by zero");
       }
       finally {
           System.out.println();
           System.out.println("From finally block");
       }
       System.out.println("Hello 1"); // this line never executes since exception occurred, exits from finally
    }
}
