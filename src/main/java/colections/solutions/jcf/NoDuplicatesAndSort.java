package colections.solutions.jcf;

import java.util.*;

public class NoDuplicatesAndSort {
	public static void main(String args[]) {
		Vector<String> vect1 = new Vector<String>();
		vect1.add("Orange"); // add duplicate fruits: Orange, Apple, Banana, Guava, Pear
		vect1.add("Apple");
		vect1.add("Banana");
		vect1.add("Guava");
		vect1.add("Pear");
		vect1.add("Guava");
		vect1.add("Banana");
		vect1.add("12");
		vect1.add("11");

		HashSet<String> hs1 = new HashSet<String>(vect1); // HashSet keeps only unique elements by default
															// if you would like Vector back
		System.out.println("HashSet with duplicates? No: " + hs1);

		Vector<String> vect2 = new Vector<String>(hs1);

		System.out.println("Vector with duplicates: " + vect1);
		System.out.println("Vector without duplicates: " + vect2);
		// if you would like the Vector elements in sorted order

		TreeSet<String> s1 = new TreeSet<String>(vect1); // TreeSet sorts the elements by default
		// System.out.println("SortedSet elements: " + s1); // you can print like this
		// also

		// if you would like Vector back
		Vector<String> vect3 = new Vector<String>(s1);
		System.out.println("Vector without duplicates and in sorted order: " + vect3);
	}
}
