package oopConcepts.part1_encapsulation;

public class Main {

    public static void main(String[] args) {
	    Car porsche = new Car();
        Car skoda = new Car();
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());
    }
}
