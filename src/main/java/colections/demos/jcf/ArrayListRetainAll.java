package colections.demos.jcf;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * retainAll: Retains only the elements in this list that are contained in the
 * specified collection. So retains common elements
 * 
 *
 */
public class ArrayListRetainAll {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Toyota");
		al.add("Honda");
		al.add("Mercedes");
		al.add("Dodge");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Honda");
		al2.add("Dodge");
		al2.add("Dodge");
		al.retainAll(al2);
		System.out.println("iterating the elements after retaining the elements of al2...");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
