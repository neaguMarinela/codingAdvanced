package simpleExercise;

import java.util.Arrays;

//java program to check the equality of two arrays using Arrays.equals() Method

public class EqualityOfArraysusingMethod {
	 
	public static void main(String[] args)
	    {    
	        int[] arrayOne = {21, 57, 11, 37, 24};
	          
	        int[] arrayTwo = {21, 57, 11, 37, 24};
	          
	        boolean equalOrNot = Arrays.equals(arrayOne, arrayTwo);
	          
	        System.out.println("Input Arrays :");
	         
	        System.out.println("First Array : "+Arrays.toString(arrayOne));
	         
	        System.out.println("Second Array : "+Arrays.toString(arrayTwo));
	         
	        if (equalOrNot)
	        {
	            System.out.println("Two Arrays Are Equal");
	        }
	        else
	        {
	            System.out.println("Two Arrays Are Not equal");
	        }
	    }
}
