package lambda.function;

import java.util.function.Function;

public class FunctionAndThenDemo2 {
	public static void main(String args[]) {

		Function<Integer, Integer> function1 = n1 -> n1 + n1;
		Function<Integer, Integer> function2 = n1 -> n1 * n1;

		System.out.println("Function 1 andThen Function 2 : " + function1.andThen(function2).apply(10));

	}

}
