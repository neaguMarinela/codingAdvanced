package problems.firstUniqueCharacterInAString;

/**
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * <p>
 * <b>Example:</b>
 * <pre>
 * s = "leetcode"
 * return 0.
 *
 * s = "loveleetcode",
 * return 2.
 * </pre>
 * <p>
 * <b>Node:</b> You may assume the string contain only lowercase letters.<br>
 *
 */
public class Solution {

    public static void main(String... args) {
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("aabbcc"));
    }

    public static int firstUniqChar(String s) {
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++)
            count[s.charAt(i) - 'a']++;

        for (int i = 0; i < s.length(); i++)
            if (count[s.charAt(i) - 'a'] == 1)
                return i;

        return -1;
    }

}
