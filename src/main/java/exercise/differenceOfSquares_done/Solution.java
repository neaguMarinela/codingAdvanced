package exercise.differenceOfSquares_done;

public class Solution {
    public static void main(String[] args) {
        System.out.println(computeDifferenceOfSquares(10));
    }
    static int computeSquareOfSumTo(int input) {
        int n = input*(input+1)/2;
        return n*n;
    }
    static int computeSumOfSquaresTo(int input) {
        int sum = 0;
        for(int i = 1; i <= input; i++)
        {
            sum += i*i;
        }
        return sum;
    }
    static int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }
}
