package colections.demos.jcf;

import java.util.Vector;

/**
 * Demos contains
 * 
 *
 */
public class VectorSearch {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();

		vector.add("element_1");

		vector.add("element_2");

		vector.add("element_3");

		vector.add("element_1");

		boolean found = vector.contains("element_2");
		System.out.println("Found element_2 : " + found);

		// first index of
		// System.out.println(vector.indexOf("element_3"));

		// last index of
		// System.out.println(vector.lastIndexOf("element_3"));

	}

}
