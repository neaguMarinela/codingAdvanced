package sat_16_03.methodReference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;

public class App
{
    public static void main( String[] args )
    {
        final String prefix = "MR. ";
        System.out.println( process("Hello World!",
                str -> prefix.concat(str)) );
        System.out.println( process2("Hello World!",
                5, String::substring));
        String[] names = {"Mr Sanjay", "Ms Trupti", "Dr John"};
        Arrays.sort(names, Comparator.comparing(App::firstName)
                .reversed());
        System.out.println("Names: " + Arrays.toString(names));
        String[] name = {"ZZ Trupti", "BB Trupti", "CC John"};
        Arrays.sort(name, Comparator.comparing(App::firstName)
                .reversed().thenComparing(App::title));
        System.out.println("Names and title: " +
                Arrays.toString(name));
    }

    public static String firstName(String name) {
        System.out.println("Name: " + name);
        System.out.println("Split name, first elem: "
                + name.split(" ")[0]);
        System.out.println("Split name, second elem: "
                + name.split(" ")[1]);
        return name.split(" ")[1];
    }

    public static String title(String name) {
        return name.split(" ")[0];
    }

    private static String process2(String str,
                                   int i, BiFunction<String, Integer,
                                    String> processor) {
        return processor.apply(str, i);
    }

    private static String process(String str,
                                  Function<String, String> processor) {
        return processor.apply(str);
    }
}
