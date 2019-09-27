package colections.solutions.jcf;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedTreeSet {

	public static void main(String[] args) {
		// Create a sorted set of some names
		SortedSet<String> sortedNames = new TreeSet<String>();
		sortedNames.add("Java");
		sortedNames.add("SQL");
		sortedNames.add("C++");
		sortedNames.add("HTML");
		sortedNames.add("CSS");
		sortedNames.add("Javascript");
		sortedNames.add("Javascript"); // removes duplicates
		// sortedNames.add(null); // compiler error for null values

		// Print the sorted set of names
		System.out.println(sortedNames); // sorts elements by default

		// Print the headSet before the given element
		System.out.println(sortedNames.headSet("HTML"));

		// Print the tailSet after the given element, including element
		System.out.println(sortedNames.tailSet("HTML"));

	}

}
