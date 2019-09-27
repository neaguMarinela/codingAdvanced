package colections.demos.sort;

import java.util.Comparator;

public class FruitRankingComparator implements Comparator<Fruit> {
	@Override
	public int compare(Fruit fruit1, Fruit fruit2) {
		return (fruit1.getRanking() - fruit2.getRanking());
	}
}
