package colections.demos.sort;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		int toSort[] = new int[] { 5, 1, 89, 255, 7, 88, 200, 123, 66 }; 
		
		Arrays.sort(toSort);
		
		System.out.println(Arrays.toString(toSort));

	}

}
