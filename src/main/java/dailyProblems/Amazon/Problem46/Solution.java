package dailyProblems.Amazon.Problem46;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.System.out;

public class Solution {

    public static void main(String... args) {
        out.println(findLongestPalindromicSubstring("aabcdcb")); // bcdcb
        out.println(findLongestPalindromicSubstring("bananas")); // anana
        out.println(findLongestPalindromicSubstring("pohgf")); // p
    }

    public static String findLongestPalindromicSubstring(String str) {
        Map<Character, List<Integer>> map = getAllPositions(str);
        int from = -1;
        int to = -1;

        for (List<Integer> positions : map.values()) {
            if (positions.size() == 1)
                continue;

            for (int i = 0; i < positions.size() - 1; i++) {
                int curFrom = positions.get(i);

                for (int j = positions.size() - 1; j > i; j--) {
                    int curTo = positions.get(j);

                    if (isPalindrome(str, curFrom, curTo)) {
                        if (from == -1 || curTo - curFrom > to - from) {
                            from = curFrom;
                            to = curTo;
                        }
                        break;
                    }
                }
            }
        }

        return from == -1 ? str.substring(0, 1) : str.substring(from, to + 1);
    }

    private static Map<Character, List<Integer>> getAllPositions(String str) {
        Map<Character, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!map.containsKey(ch))
                map.put(ch, new ArrayList<>());

            map.get(ch).add(i);
        }

        return map;
    }

    private static boolean isPalindrome(String str, int from, int to) {
        for (; from < to; from++, to--)
            if (str.charAt(from) != str.charAt(to))
                return false;
        return true;
    }

}
