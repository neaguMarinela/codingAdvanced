package dailyProblems.Amazon.Problem154;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;


public class Solution {

    public static void main(String... args) {
        int[] arr = {9, 12, 3, 5, 14, 10, 10};
        System.out.println(Arrays.toString(arr));

        Stack<Integer> stack = new Stack<>();

        for (int item : arr)
            stack.push(item);

        for (int i = 0; i < arr.length; i++)
            System.out.println(stack.pop());
    }
}
