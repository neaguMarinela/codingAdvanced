package absint.lab;

public class Launch_AnimalTest {
    public static void main(String[] args) {
		Animal dog = new Dog();
		dog.sound();
		dog.eat();
		dog.run();
		System.out.println("---------");

		Animal tiger = new Tiger();
		tiger.sound();
		tiger.eat();
		tiger.run();
		System.out.println("---------");
		
		Animal horse = new Horse();
		horse.sound();
		horse.eat();
		horse.run();
	}
}
