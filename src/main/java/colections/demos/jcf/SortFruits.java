package colections.demos.jcf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class SortFruits {

	public static void main(String[] args) {
		HashSet<String> fruits = new HashSet<String>();

		// add fruits
		fruits.add("Orange"); // Orange, Apple, Banana, Guava, Pear
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Guava");
		fruits.add("Pear");
		// fruits.add(null);
		// fruits.add(null);
		fruits.add("Pear");

		System.out.println("HashSet elements before sorting: " + fruits); // unique unsorted set

		List<String> fruitList = new ArrayList<String>(fruits);
		Collections.sort(fruitList); // sorts in ascending order
		System.out.println("fruitList elements after sorting: " + fruitList);

		HashSet<String> fruits2 = new HashSet<String>(fruitList);
		// fruits2.addAll(fruitList); // same behavior like constructor

		System.out.println("HashSet elements after adding sorted list: " + fruits2); // no guarantee of sorted order
																						// even though fruitList was
																						// sorted

		// Method 2: Sorting using TreeSet
		TreeSet<String> tset = new TreeSet<String>(fruits);

		System.out.println("HashSet elements after using TreeSet: " + tset); // gets sorted by default
	}

}
