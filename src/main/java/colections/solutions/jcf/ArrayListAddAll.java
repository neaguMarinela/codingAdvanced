package colections.solutions.jcf;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAddAll {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Toyota");
		al.add("Honda");
		al.add("Mercedes");
		// al.add(null); al.add(null); // does retains nulls
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Honda");
		al2.add("Dodge");
		al.addAll(al2); // addAll
		System.out.println("iterating the elements after retaining the elements of al2...");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next()); // does retains duplicates
		}
	}
}
