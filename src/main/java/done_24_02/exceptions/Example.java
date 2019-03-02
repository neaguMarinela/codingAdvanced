package done_24_02.exceptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        double result = divide();
        System.out.println(result);
    }

    private static double divide() {
        double x, y;
        try {
            x = getInt();
            y = getInt();
        } catch(NoSuchElementException e) {
            throw new ArithmeticException("no suitable" +
                    " input");
        }
        System.out.println("x is " + x + ", y is " + y);
        try {
            return x / y;
        } catch(ArithmeticException e) {
            throw new ArithmeticException("attempt to " +
                    "divide by zero");
        }
    }

    private static double getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        while(true) {
            try {
                return s.nextInt();
            } catch(InputMismatchException e) {
                s.nextLine();
                System.out.println("Please enter a " +
                        "number using only the digits " +
                        "0 to 9 ");
            }
        }
    }
}
