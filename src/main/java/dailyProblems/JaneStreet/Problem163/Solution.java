package dailyProblems.JaneStreet.Problem163;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {

    public static void main(String... args) {
        System.out.println(evaluateReversePolishNotation(new Object[] { 5, 3, '+' }));    // 8
        System.out.println(evaluateReversePolishNotation(new Object[] { 15, 7, 1, 1, '+', '-', '/', 3, '*', 2, 1, 1, '+', '+', '-' }));    // 5
    }

    public static double evaluateReversePolishNotation(Object[] expr) {
        Deque<Double> stack = new LinkedList<>();


        for (Object item : expr) {
            if (item instanceof Number)
                stack.push(((Number)item).doubleValue());
            else {
                double two = stack.pop();
                double one = stack.pop();
                char op = (Character)item;

                if (op == '+')
                    stack.push(one + two);
                else if (op == '-')
                    stack.push(one - two);
                else if (op == '/')
                    stack.push(one / two);
                else if (op == '*')
                    stack.push(one * two);
            }
        }

        return stack.pop();
    }
}
