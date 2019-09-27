package colections.demos.jcf;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorRetrievalStyles {

	public static void main(String[] args) {
		Vector<Object> vect1 = new Vector<Object>();
		vect1.add(11);
		vect1.add(21);
		vect1.add(11.5);
		vect1.add("hello");
		vect1.add('A');
		vect1.add('A'); // duplicate element A: retains it
		vect1.setElementAt("world", 3); // update operation

		System.out.println("vect1:: " + vect1); // style 1

		System.out.println("Elements with foreach: "); // style 2
		for (Object obj : vect1) {
			System.out.print(obj + " ");
		}

		System.out.print("\nElements with Enumeration: "); // style 3
		Enumeration<Object> e = vect1.elements();
		while (e.hasMoreElements()) {
			System.out.print(e.nextElement() + " ");
		}

		vect1.remove(11.5);
		System.out.print("\nElements with Iterator: ");// style 4
		Iterator<Object> it1 = vect1.iterator();
		while (it1.hasNext()) {
			System.out.print(it1.next() + " ");
		}

		System.out.print("\nElements with ListIterator: "); // style 5
		ListIterator<Object> it2 = vect1.listIterator(2); // read elements from 2nd index to the end
		while (it2.hasNext()) {
			System.out.print(it2.next() + " ");
		}

		vect1.remove(0); // delete operation
		System.out.println("vect1:: " + vect1); // style 1

	}

}
