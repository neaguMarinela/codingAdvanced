package sat_16_03.genericType;

public class App {

	public static void main(String[] args) {
		
		GenericMethod genericMethod = new GenericMethod();
		genericMethod.showItem(34.7);
		System.out.println("The returned item is: " + genericMethod.showItem(45));
		
		Integer[] integerArray = {3,4,5,2,1};
		String[] names = {"Kevin","Joe","Adam","Smith"};
		
		genericMethod.showArray(names);

		System.out.println("\n**********");

		genericMethod.showArray(integerArray);

	}
}
