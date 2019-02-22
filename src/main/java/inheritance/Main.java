package inheritance;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        animal.eat();
        System.out.println("************************");
        animal.move(6);

        System.out.println("************************");

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();
        System.out.println("************************");
        dog.move(6);
        System.out.println("************************");
        //dog.chew();
        dog.walk();
        System.out.println("************************");
        dog.run();

        System.out.println("************************");

        Fish fish = new Fish("Fish", 3, 3,1, 2, 1);
        fish.rest();
        System.out.println("************************");
        fish.eat();
        System.out.println("************************");
        fish.swim(5);

    }
}