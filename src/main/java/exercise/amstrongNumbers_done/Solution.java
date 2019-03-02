package exercise.amstrongNumbers_done;

import static java.lang.Math.pow;

public class Solution {

    public static void main(String[] args) {
        System.out.println(isArmstrongNumberVar1(153));
        System.out.println(isArmstrongNumberVar2(153));
        System.out.println(isArmstrongNumberVar3(153));

    }

    static boolean isArmstrongNumberVar1(int numberToCheck) {
        String numberToCheckString = numberToCheck + "";
        int howManyDigits = numberToCheckString.length();
        int sum = 0;
        for(int i = 0; i < howManyDigits; i++) {
            sum += (int) pow(
                    (double) Character.getNumericValue
                            (numberToCheckString.charAt(i)),
                    (double) howManyDigits);
        }
        return (sum == numberToCheck);
    }
    static boolean isArmstrongNumberVar2(int numberToCheck) {
        double sum = 0;
        String numStr = Integer.toString(numberToCheck);

        for (Integer i = 0; i < numStr.length(); i++) {
            String num = numStr.substring(i, i + 1);
            sum += pow(Integer.parseInt(num), numStr.length());
        }
        return sum == numberToCheck;
    }

    static boolean isArmstrongNumberVar3(int numberToCheck) {

        int numberLength = Integer.toString(numberToCheck).length();

        return (numberToCheck ==
                String.valueOf(numberToCheck)
                        .chars()
                        .map(d -> (int) pow(Character.getNumericValue(d),numberLength))
                        .sum()
        );
    }
}
