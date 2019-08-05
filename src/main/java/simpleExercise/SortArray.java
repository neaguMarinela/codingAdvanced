package simpleExercise;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		
		//Number Array sorting
		int data[] = { 4, 10, 2, 6, 1 };
		
		Arrays.sort(data); //sort the elements in array
		
		for(int i:data)
		{
			System.out.println(i);
		}
		
		//String array sorting
		 String data2[] = {"z","a","x","b","z","a"};
		 
		 Arrays.sort(data2);
		 
		 for(String i:data2)
		 {
			 System.out.println(i);
		 }
				
	}

}
