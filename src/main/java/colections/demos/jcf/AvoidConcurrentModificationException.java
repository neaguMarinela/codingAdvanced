package colections.demos.jcf;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class AvoidConcurrentModificationException {

	public static void main(String[] args) {
		List<String> myList = new CopyOnWriteArrayList<String>(); // CopyOnWriteArrayList is thread safe alternative of
																	// ArrayList. replacing it with ArrayList causes
																	// ConcurrentModificationException

		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");

		Iterator<String> it = myList.iterator();
		while (it.hasNext()) {
			String value = it.next();
			System.out.println("List Value:" + value);
			if (value.equals("3")) {
				myList.remove("4");
				myList.add("6");
				myList.add("7");
			}
		}
		System.out.println("List Size:" + myList.size());

	}

}
