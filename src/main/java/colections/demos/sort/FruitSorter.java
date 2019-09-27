package colections.demos.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * FruitSorter using Comparable interface
 * 
 *
 */
public class FruitSorter {

	public static void main(String[] args) {
		List<Fruit> fruits = new ArrayList<Fruit>();
		Fruit fruit1 = new Fruit("red", "aromatic", "hard", "round", "tart", 2, 2.1);
		Fruit fruit2 = new Fruit("brown", "aromatic", "soft", "oval", "tart", 4, 2.2);
		Fruit fruit3 = new Fruit("green", "aromatic", "hard", "round", "tart", 3, 1);
		fruits.add(fruit1);
		fruits.add(fruit2);
		fruits.add(fruit3);

		System.out.println("Before Sorting : " + fruits);
		Collections.sort(fruits);
		System.out.println("After Sorting : " + fruits);

	}

}
