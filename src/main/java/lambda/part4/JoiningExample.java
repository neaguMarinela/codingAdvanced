package lambda.part4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JoiningExample {
    public static void main(String[] args){
        String[] words = new String[]{"These", "are", "a", "few",
                "words", "used", "to", "describe"};

        String one = Arrays.stream(words)
                .collect(Collectors.joining());
        System.out.println(one);

        String two = Arrays.stream(words)
                .collect(Collectors.joining("+"));
        System.out.println(two);

        String three = Arrays.stream(words)
                .collect(Collectors.joining(" ",
                        "Hello World "," the program"));
        System.out.println(three);

    }
}
