package exercise.luhnFormula;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isValid("4539 1488 0343 6467"));
        System.out.println(isValid("8273 1232 7352 0569"));
    }

    static boolean isValid(String candidate) {
        return isContainOnlyDigitAndSpace(candidate) && isValidNumber(candidate);
    }

    private static boolean isContainOnlyDigitAndSpace(String candidate) {
        return candidate.matches("^[\\d ]*$");
    }

    private static boolean isValidNumber(String candidate) {
        String digits = candidate.replace(" ", "");
        if (digits.length() <= 1) {
            return false;
        }

        List<Integer> integers = mapToInt(digits);

        int sum = getSumOfDigits(integers);
        return sum % 10 == 0;
    }

    private static List<Integer> mapToInt(String digits) {
        return digits.chars()
                .mapToObj(Character::getNumericValue)
                .collect(Collectors.toList());
    }

    private static int getSumOfDigits(List<Integer> integers) {
        return IntStream.rangeClosed(1, integers.size())
                .map(i -> {
                    int elem = integers.get(integers.size() - i);
                    return i % 2 == 0 ? doubleDigit(elem) : elem;
                })
                .sum();
    }

    private static int doubleDigit(int digit) {
        int doubled = digit * 2;
        return doubled > 9 ? doubled - 9 : doubled;
    }

}
