package dailyProblems.Amazon.Problem57;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String... args) {
        List<String> res = splitIntoWords("the quick brown fox jumps over the lazy dog", 5);
        System.out.println(res != null ? Arrays.toString(res.toArray(new String[0])) : null);
    }

    public static List<String> splitIntoWords(String str, int k) {
        String[] words = str.split("\\s+");
        List<String> res = new ArrayList<>(words.length);
        StringBuilder buf = null;

        for (String word : words) {
            if (word.length() > k)
                return null;
            if (buf == null)
                buf = new StringBuilder(word);
            else if (buf.length() + word.length() + 1 <= k)
                buf.append(' ').append(word);
            else {
                res.add(buf.toString());
                buf = new StringBuilder(word);
            }
        }

        if (buf != null)
            res.add(buf.toString());

        return res;
    }

}
