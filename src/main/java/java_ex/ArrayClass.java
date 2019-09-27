package java_ex;

public class ArrayClass {

    String[] names = new String[10];
    int[] numbers = new int[5];


    public void insert() {

        names[0] = "Jack";
        names[1] = "Ali";
        names[2] = "Rahul";

        numbers[1] = 12;
    }

    public void displayArray() {

        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {

        ArrayClass ac = new ArrayClass();
        ac.insert();
        ac.displayArray();

    }

}
