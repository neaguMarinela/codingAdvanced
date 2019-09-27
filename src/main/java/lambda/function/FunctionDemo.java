package lambda.function;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String args[]) {
		beforeJava8();//Without Function Functional Interface
		fromJava8();//With Function Functional Interface
	}
	private static void beforeJava8() {
		Integer usd = 10;
		Double inrValue = convertUsdToInr(usd);
		System.out.println("From beforeJava8 "
				+usd + " USD = " + inrValue + " INR");
	}
	private static Double convertUsdToInr(Integer usd) {
		Double inrRate = 71.0;
		return usd * inrRate;
	}
	private static void fromJava8() {
		Double inrRate = 71.0;
		Function<Integer, Double> function = usd -> usd * inrRate;
		System.out.println("From fromJava8 " +10
				+ " USD = " + function.apply(10) + " INR");
}

}















