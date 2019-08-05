package exceptions.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {

	public void readFile() throws FileNotFoundException {
		
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\User\\file.txt"));
		
		throw new FileNotFoundException("This is from within the readFile() method");
		
	}
}
