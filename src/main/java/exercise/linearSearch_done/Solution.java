package exercise.linearSearch_done;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        list.add(new Integer(4));

        System.out.println(search(5, list));
    }

    public static int search(Integer n, List<Integer> list) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(n)) {
                index = i;
                break;
            }
        }
        return index;
    }
}
