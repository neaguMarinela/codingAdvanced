package oopConcepts.part4_inheritance;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;
    public Fish(String name, int size, int weight,
                int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
    private void rest() {
        System.out.println("rest method");
    }
    private void moveMuscles() {
        System.out.println("moveMuscles method");
    }
    private void moveBackFin() {
        System.out.println("moveBackFin method");
    }
    private void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
