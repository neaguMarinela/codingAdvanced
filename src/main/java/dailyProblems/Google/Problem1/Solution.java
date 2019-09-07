package dailyProblems.Google.Problem1;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String... args) {
        int[] arr = { 10, 15, 3, 7 };
        System.out.println(check(arr, 18));
    }

    public static boolean check(int[] arr, int k) {
        if (arr == null || arr.length < 2)
            return false;

        Set<Integer> tmp = new HashSet<>();

        for (int val : arr) {
            if (tmp.contains(val))
                return true;
            tmp.add(k - val);
        }

        return false;
    }

}
