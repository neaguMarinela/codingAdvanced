package lambda.foreach;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {
	public static void main(String args[]) {
		withoutForEach();
		withForEach();
	}
	private static void withoutForEach() {
		System.out.println("From withoutForEach");
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		for (int i : intList) {
			System.out.println(i);
		}
	}
	private static void withForEach() {
		System.out.println("From withForEach");
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		intList.forEach(System.out::println);

	}

}
