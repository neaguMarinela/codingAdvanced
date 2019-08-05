package exceptions.example;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	/**
	 * Exception: problem that arises during the execution of the application
	 * 	For example: user input is incorrect, file not found ...
	 * 
	 * 	1.) CHECKED EXCEPTIONS
	 * 			Exceptions that occur in compile time
	 * 				"compile time exceptions"
	 * 
	 * 			~ so we are not able not to consider these exceptions
	 * 				Programmer should handle these exceptions
	 * 
	 * 			For example: FileWriter file not found
	 * 
	 * 	2.) UNCHECKED EXCEPTIONS
	 * 			Exceptions that occur in runtime
	 * 				"runtime exceptions"
	 * 
	 * 			These exceptions are ignored at the time of compilation
	 * 			
	 * 			For example: ArrayOutOfBoundsException
	 * 							+ we divide by 0 
	 * 
	 * 	3.) ERROR
	 * 			Problems arise beyond the control
	 * 				of the user or programmer
	 * 
	 * 		They are ignored in compile time as well as in runtime
	 * 
	 * 		For example: OutOfMemoryError
	 * @throws FileNotFoundException 
	 * 
	 */
	
	public static void main(String[] args) {
		
		FileHandler fileHandler = new FileHandler();
		
		
		try {
			fileHandler.readFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			System.out.println("This code will run no matter what...");
		}
		
		
	}
}
