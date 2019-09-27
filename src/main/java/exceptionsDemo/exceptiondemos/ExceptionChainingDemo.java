package exceptionsDemo.exceptiondemos;

/**
 * ExceptionChainingDemo
 * 
 *
 */
public class ExceptionChainingDemo {
	
    void show() throws Exception { // Does not catch the Exception but creates/overrides/throws a new Exception without Nesting the Original cause of exception and its message
    	// Caller show2
        throw new Exception("my.own.Exception"); // comment it out, it won't cause exception to pass down to the caller
    }

    void show2() throws Exception { // Does not catch yet throws the Exception to the Caller show3
        show();
    }

    void show3() throws Exception {  // Does not catch yet throws the Exception to the Caller main
        show2();
    }
    
	public static void main(String args[]) throws Exception { // Does not catch yet throws the Exception to the Caller JVM it prints the stacktrace to the console, else causes compilation error
		ExceptionChainingDemo o1 = new ExceptionChainingDemo();
        o1.show3();
	}
}
