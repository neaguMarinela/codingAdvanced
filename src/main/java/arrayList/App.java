package arrayList;

import java.util.ArrayList;
import java.util.List;
 
public class App {
 
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        // Adding
        numbers.add(10);
        numbers.add(100);
        numbers.add(40);
        // Retrieving
        System.out.println(numbers.get(0));
        System.out.println("Iteration #1: ");
        // Indexed for loop iteration
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        // Removing items (careful!)
        numbers.remove(numbers.size() - 1);
        // This is VERY slow
        numbers.remove(0);
        System.out.println("Iteration #2: ");
        for (Integer value : numbers) {
            System.out.println(value);
        }
    }
}