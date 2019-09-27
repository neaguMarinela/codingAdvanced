package exercise.isograms;

import java.util.ArrayList;
import java.util.List;

class Solution {

    static boolean isIsogram(String phrase) {
        if(phrase.length() == 0)
            return true;
        List<Character> seenCharacters = new ArrayList<>();
        for (char ch: phrase.toLowerCase().toCharArray()) {
            if (seenCharacters.contains(ch))
                return false;
            if(ch != ' ' && ch != '-')
                seenCharacters.add(ch);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsogram("lumber-jackss"));
    }
}