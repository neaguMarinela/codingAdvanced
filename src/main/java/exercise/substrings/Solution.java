package exercise.substrings;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

    static List<String> slices(int numberOfDigits, String inputNumber) {
        if (numberOfDigits < 1) {
            throw new IllegalArgumentException("Slice size is too small.");
        }
        if (numberOfDigits > inputNumber.length()) {
            throw new IllegalArgumentException("Slice size is too big.");
        }
        return IntStream.rangeClosed(0, inputNumber.length() - numberOfDigits)
                .mapToObj(n -> inputNumber.substring(n, n + numberOfDigits))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        String str = "49142";
        System.out.println(slices(4, str));
    }
}
