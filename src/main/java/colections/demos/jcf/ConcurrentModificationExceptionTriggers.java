package colections.demos.jcf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExceptionTriggers {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();

		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");

		Iterator<String> it = myList.iterator(); // iterator copies original list into other internal list, size is
													// factored into
		while (it.hasNext()) {
			String value = it.next();
			System.out.println("List Value:" + value);
			if (value.equals("3")) {
				myList.remove("3"); // notice the size of the list changed due to removal or
				// addition
				// myList.add("6");
				// myList.add("7");
			}
		}
		System.out.println("List Size:" + myList.size());
	}
}
