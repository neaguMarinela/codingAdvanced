package sat_16_03.genericType;

public class Example {
    public static <T extends Comparable<T>> T
                calculateMin(T t1, T t2) {
        if(t1.compareTo(t2) < 0 )
            return t1;
        return t2;
    }
    public static void main(String[] args) {
        System.out.println( calculateMin(100, 23));
        System.out.println( calculateMin("a", "aa"));
    }
}
