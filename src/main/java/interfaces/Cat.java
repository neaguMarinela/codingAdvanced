package interfaces;

public class Cat implements Animal, Mammal {

	@Override
	public void move() {
		System.out.println("Cat is moving...");
	}

	@Override
	public void eat() {
		System.out.println("Cat is eating...");
	}
}
