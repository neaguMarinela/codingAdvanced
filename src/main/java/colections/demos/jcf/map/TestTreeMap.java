package colections.demos.jcf.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestTreeMap {

	public static void main(String[] args) {

		/* This is how to declare TreeMap */
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();

		/* Adding elements to TreeMap */
		tmap.put(1, "Data1");
		tmap.put(22, "Data2");
		tmap.put(71, "Data3");
		tmap.put(5, "Data4");
		tmap.put(2, "Data5");
		tmap.put(2, "Data6");
		//tmap.put(null, "Data7"); java.lang.NullPointerException

		/* Display content using Iterator */
		Set<Map.Entry<Integer, String>> set = tmap.entrySet();
		Iterator<Map.Entry<Integer, String>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> mentry = iterator.next();
			System.out.print("key is: " + mentry.getKey() + " & Value is: ");
			System.out.println(mentry.getValue());
		}

	}

}
