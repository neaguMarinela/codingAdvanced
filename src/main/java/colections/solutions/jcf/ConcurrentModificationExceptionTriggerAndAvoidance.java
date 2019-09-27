package colections.solutions.jcf;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModificationExceptionTriggerAndAvoidance {

	public static void main(String[] args) {
		Map<String, String> myMap = new ConcurrentHashMap<String, String>();// replace ConcurrentHashMap with Hashmap it
																			// will cause
																			// ConcurrentModificationException
		myMap.put("1", "1");
		myMap.put("2", "2");
		myMap.put("3", "3");

		Iterator<String> it1 = myMap.keySet().iterator();
		while (it1.hasNext()) {
			String key = it1.next();
			System.out.println("Map Value:" + myMap.get(key));
			if (key.equals("1")) {
				myMap.remove("3");
				myMap.put("4", "4");
				myMap.put("5", "5");
			}
		}

		System.out.println("Map Size:" + myMap.size());

	}

}
