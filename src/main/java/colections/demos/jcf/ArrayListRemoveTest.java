package colections.demos.jcf;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRemoveTest {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("3");
		al.add("2");
		al.add("1");
		al.add("2");
		al.add("4");

		System.out.println(al);

		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			itr.next(); // comment this line and test
			itr.remove(); // causes java.lang.IllegalStateException if next is not called before
		}
	}
}


