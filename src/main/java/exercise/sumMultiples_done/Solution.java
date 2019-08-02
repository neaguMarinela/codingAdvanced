package exercise.sumMultiples_done;

public class Solution {
    public static void main(String[] args) {
        System.out.println(sum(10));
    }

    public static Integer sum(Integer n) {
        Integer sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println("Multiple of 3 or 5 until n is " + i);
                sum += i;
            }
        }
        return sum;
    }
}