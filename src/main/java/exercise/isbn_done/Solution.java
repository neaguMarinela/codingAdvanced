package exercise.isbn_done;

import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isValidVar1("3-598-21508-8"));
        System.out.println(isValidVar1("3-598-21507-X"));
        System.out.println(isValidVar1("3598215088"));
        System.out.println(isValidVar1("3-598-21507-Y"));
        System.out.println(isValidVar1("3-598-21507-9"));

        System.out.println("*************************");

        System.out.println(isValidVar2("3-598-21508-8"));
        System.out.println(isValidVar2("3-598-21507-X"));
        System.out.println(isValidVar2("3598215088"));
        System.out.println(isValidVar2("3-598-21507-Y"));
        System.out.println(isValidVar2("3-598-21507-9"));
    }

    static boolean isValidVar1(String stringToVerify) {
        stringToVerify = stringToVerify.replace("-",
                "");
        if(stringToVerify.length() != 10 ) return false;
        int checkSum = 0;
        for(int i = 0; i < stringToVerify.length(); i++) {
            if(isValidCharacter(stringToVerify.charAt(i), i)) {
                checkSum += (10 - i) *
                        getCharacterValue(stringToVerify.charAt(i));
            } else {
                return false;
            }
        }
        return ((checkSum % 11) == 0);
    }
    static boolean isValidCharacter(char c, int numPos) {
        return ((c == 'X' && numPos == 9) || Character.isDigit(c));
    }
    static int getCharacterValue(char c) {
        if(c == 'X') return 10;
        else return Character.getNumericValue(c);
    }

   //************************************************************


    private static final int VALID_NUM_CHARS = 10;
    private static final String VALID_CHARS_REGEX = "[^0-9X]";
    private static final String VALID_CHECK_CHAR = "X";
    static public boolean isValidVar2(String stringToVerify) {
        stringToVerify = stringToVerify.toUpperCase()
                .replaceAll(VALID_CHARS_REGEX, "");
        if (stringToVerify.length() != VALID_NUM_CHARS)
            return false;
        if (stringToVerify.contains(VALID_CHECK_CHAR) &&
                !stringToVerify.endsWith(VALID_CHECK_CHAR))
            return false;
        int values[] = stringToVerify.chars()
                .map(x -> x=='X' ? 10 :
                        Character.getNumericValue((char) x))
                .toArray();
        return (IntStream.range(0, values.length)
                .map(i-> values[values.length-i-1] * (i+1))
                .sum() % 11) == 0;
    }
}
