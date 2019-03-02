package exercise.rain_done;

public class Solution {
    public static void main(String[] args) {
        System.out.println(convert(60));
    }
    static String convert(int number) {
        StringBuilder sb = new StringBuilder(20);
        if (number % 3 == 0) {
            sb.append("Pling");
        }
        if (number % 5 == 0) {
            sb.append("Plang");
        }
        if (number % 7 == 0) {
            sb.append("Plong");
        }
        if (sb.length() == 0) {
            sb.append(number);
        }
        return sb.toString();
    }
}
