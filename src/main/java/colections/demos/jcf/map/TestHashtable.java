package colections.demos.jcf.map;

import java.util.Hashtable;

public class TestHashtable {

	public static void main(String[] args) {
		// creating a hash table
		Hashtable<Integer, String> h = new Hashtable<Integer, String>();

		h.put(3, "Apples");
		h.put(2, "Mangoes");
		h.put(1, "Oranges");

		// create a clone or shallow copy of hash table h
		Hashtable<Integer, String> h1;
		h1 = (Hashtable<Integer, String>) h.clone();

		// checking clone h1
		System.out.println("values in clone: " + h1);

		// checking h and h1 are equals after clone
		System.out.println("equals:: true:: " + h.equals(h1));

		// check whether a value exists or not: contains and containsValue are identical
		if (h.contains("Mangoes"))
			System.out.println("value found in table");
		else
			System.out.println("value not found in table");

		// check whether a key exists or not: containsKey
		if (h.containsKey(2))
			System.out.println("key found in table");
		else
			System.out.println("key not found in table");

		// get the value mapped with key 1
		System.out.println("Oranges:: " + h.get(1));

		// obtaining hash code
		System.out.println("hash code is: " + h.hashCode());

		// size of hash table
		System.out.println("Size is: " + h.size());

		// clear hash table h
		h.clear();

		// checking hash table h
		System.out.println("after clearing: " + h);

		// checking whether hash table h is empty or not after clear operation
		if (h.isEmpty())
			System.out.println("yes hash table is empty");
		else
			System.out.println("hash table is not empty");

		// size of hash table after clear
		System.out.println("Size after clear: " + h.size());
	}
}
