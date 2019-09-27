package absint.lab;

public class Dog extends Animal {
	
	/**
	 * HowTo's are addressed here
	 */
	@Override
	public void sound() {
		System.out.println("Bark Woof Woof Woof!");
	}
	public void guard() {
		System.out.println("Guarding");
	}
}
