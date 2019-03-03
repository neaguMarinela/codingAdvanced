package exercise.stream;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class Solution {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(getString(list));
    }
    public static String getString(List<Integer> list) {
        return list.stream()
                .map(i -> i % 2 == 0 ? "e" + i : "o" + i)
                .collect(joining(","));
    }
}
