package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //int x = 98;
        //int y = 0;
        //System.out.println(divide1(x, y));

        System.out.println("**************************");

        //int x = 98;
        //int y = 0;
        //System.out.println(divide2(x, y));

        System.out.println("**************************");

        //System.out.println(divide3());

        System.out.println("**************************");

        //int x = 98;
        //int y = 0;
        //System.out.println(divide(x, y));

        System.out.println("**************************");

        //int x1 = getInt1();
        //System.out.println("x is " + x1);

        System.out.println("**************************");

        //int x2 = getInt2();
        //System.out.println("x is " + x2);

        System.out.println("**************************");

        try {
            int result = divide3();
            System.out.println(result);
        } catch(Exception e) {
            System.out.println(e.toString());
            System.out.println("Unable to perform division");
        }

        System.out.println("**************************");

        // You can actually handle RuntimeExceptions if you want to;
        // for example, here we handle an ArrayIndexOutOfBoundsException
        /*int a[] = new int[2];
        try {
            System.out.println("Access element three :" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown  :" + e);
        }finally {
            a[0] = 6;
            System.out.println("First element value: " + a[0]);
            System.out.println("The finally statement is executed");
        }*/

        //checked exception
        //File file = new File("E://file.txt");
        //FileReader fr = new FileReader(file);

        System.out.println("**************************");

        //unchecked exception
        //int num[] = {1, 2, 3, 4};
        //System.out.println(num[5]);

        System.out.println("**************************");

        // Null pointer exception ....
        //String text = null;
        //System.out.println(text.length());

    }

    private static int getInt2() {
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an integer ");
        String input = s.next();
        for(int i=0; i<input.length(); i++) {
            if(!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if(isValid) {
            return Integer.parseInt(input);
        }
        return 0;
    }

    private static int getInt1() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        try {
            return s.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("InputMismatchException " + e);
            return 0;
        }
    }

    private static int divide1(int x, int y) {
        if(y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }

    private static int divide2(int x, int y) {
        try {
            return x / y;
        } catch(ArithmeticException e) {
            System.out.println("ArithmeticException " + e);
            return 0;
        }
    }

    private static int divide(int x, int y) {
        return x / y;
    }

    private static int divide3() {
        int x, y;
//        try {
        x = getInt1();
        y = getInt1();
        System.out.println("x is " + x + ", y is " + y);
        return x / y;
//        } catch(NoSuchElementException e) {
//            throw new ArithmeticException("no suitable input");
//        } catch(ArithmeticException e) {
//            throw new ArithmeticException("attempt to divide by zero");
//        }
    }
}
