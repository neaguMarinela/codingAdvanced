package colections.demos.jcf;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Demo using iterator. Can also use for-each.
 * 
 *
 */
public class ArrayListRetrieval {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Honda");// Adding object in arraylist
		list.add("Toyota");
		list.add("Mercedes");
		list.add("BMW");
		// Traverse list through Iterator
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
