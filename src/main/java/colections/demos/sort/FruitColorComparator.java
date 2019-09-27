package colections.demos.sort;

import java.util.Comparator;

public class FruitColorComparator implements Comparator<Fruit> {
	@Override
	public int compare(Fruit fruit1, Fruit fruit2) {
		return fruit1.getColor().compareTo(fruit2.getColor());
	}
}
