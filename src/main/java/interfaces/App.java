package interfaces;

public class App {

	/**
	 * Similar to a class: a collection of abstract methods
	 * 		A class can 'implements' an interface
	 * 			~ inheriting the methods of the interface
	 * 		
	 * 					CONTAINS BEHAVIOR OF A CLASS
	 * 
	 * 		- it can have as many methods as we want
	 * 		- no implementation
	 * 		- we can not instantiate an interface
	 * 		
	 * 		Why is it good?
	 * 			Because a class can extends a single class
	 * 				BUT can implements several interfaces
	 * 
	 */
	
	public static void main(String[] args) {
		
		Animal cat = new Dog();
		cat.move();
		
	}
}
