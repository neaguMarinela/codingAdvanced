package exercise.arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    static List<Object> flattenVar1(List<? extends Object> asList) {
        List<Object> result = new ArrayList<>();
        for(Object item : asList) {
            if (item == null) {
                continue;
            }
            if (item instanceof List<?>) {
                result.addAll(flattenVar1((List<?>)item));
            } else {
                result.add(item);
            }
        }
        return result;
    }

    static List<Object> flattenVar2(List nestedList) {
        List<Object> flatList = new LinkedList<>();

        for (Object o : nestedList) {
            if (o instanceof List) {
                flatList.addAll(flattenVar2((List) o));
            } else {
                if (o != null) {
                    flatList.add(o);
                }
            }
        }

        return flatList;
    }

    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        List<Object> objects1 = new ArrayList<>();
        List<Object> objects2 = new ArrayList<>();
        List<Object> objects3 = new ArrayList<>();

        append(objects1, 3);
        append(objects2, 5);

        objects1.add("Four");
        objects1.add(null);

        objects3.add(null);

        objects.add(objects1);
        objects.add(objects2);
        objects.add(objects3);

        System.out.println(objects);

        System.out.println(flattenVar1(objects));
        System.out.println(flattenVar2(objects));

    }

    public static void append(Collection<? super Integer> integers, int n) {
        for (int i = 1; i <= n; i++) {
            integers.add(i);
        }
    }


}
