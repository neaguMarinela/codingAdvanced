package colections.demos.jcf.map;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("Mango", "Mango"); // put operations
		hm.put("Lime", "Lime");
		hm.put("Peach", "Peach2");
		hm.put("Peach", "Peach1"); // keeps unique last item for duplicates

		hm.put(null, "null2"); // permits nulls once
		hm.put(null, "null1");

		for (Map.Entry<String, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// get Peach
		System.out.println(hm.get("Peach")); // get operation

		System.out.println(hm.get(null)); // get operation with null key

		// remove Lime
		System.out.println("Lime value: " + hm.remove("Lime")); // get operation using Lime key
		// access Lime?
		System.out.println("Lime value after removal: " + hm.get("Lime")); // get operation after removing that element
																			// returns nulls
	}
}
