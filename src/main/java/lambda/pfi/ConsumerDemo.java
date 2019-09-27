package lambda.pfi;

import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String args[]) {
		beforeJava8();
		fromJava8();

	}

	private static void beforeJava8() {
		dispalyInUpperCase("Java 8");
	}

	private static void dispalyInUpperCase(String str) {
		System.out.println(str.toLowerCase());

	}

	private static void fromJava8() {
		Consumer<String> consumer = str -> System.out.println(str.toLowerCase());
		consumer.accept("Java 8");

	}

}
