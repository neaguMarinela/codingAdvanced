package absint.lab;

// not implemented methods (What), to be implemented by subclasses (How)
public abstract class Animal {
	private String color;
	private String pattern;
	private String type; //mammal or non-mammal
	
	/**
	 * Behaviors: What's only, HowTos are left to the sub classes
	 */
	public abstract void sound();
	/**
	 * Common behaviors: What's and HowTos
	 */
	public void eat() {
		System.out.println("Eating");
	}
	public void run() {
		System.out.println("Running");
	}
}
