package lambda.pfi;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String args[]) {
		withoutPredicate();
		withPredicate();
	}

	private static void withoutPredicate() {
		System.out.println("From withoutPredicate");
		Integer transactionAmount = 20000;
		if (isGreater(transactionAmount)) {
			System.out.println("Transaction Amount can't be greater than 10000");
		} else {
			System.out.println("Transaction Amount is less than 10000, please proceed");
		}

	}

	public static Boolean isGreater(Integer i) {
		if (i > 10000) {
			return true;
		} else {
			return false;
		}
	}

	private static void withPredicate() {
		System.out.println("From withPredicate!");
		Integer amount = 20000;
		Predicate<Integer> p = transactionAmount -> transactionAmount > 10000;
		if (p.test(amount)) {
			System.out.println("Transaction Amount can't be greater than 10000");
		} else {
			System.out.println("Transaction Amount is less than 10000, please proceed");
		}

	}

}
