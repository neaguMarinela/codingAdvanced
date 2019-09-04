package dailyProblems.Google.Problem35;

import java.util.Arrays;

public class Solution {

    public static void main(String... args) {
        char[] arr = { 'G', 'B', 'R', 'R', 'B', 'R', 'G' };
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(char... arr) {
        int r = 0;
        int len = arr.length - 1;
        int i = 0;

        while (i <= len) {
            if (arr[i] == 'R')
                swap(arr, i++, r++);
            else if (arr[i] == 'B')
                swap(arr, i, len--);
            else
                i++;
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char ch = arr[i];
        arr[i] = arr[j];
        arr[j] = ch;
    }

}
