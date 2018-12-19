package java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class CollectionsLambda {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.add("four");

        strings.forEach(str -> System.out.println(str));
    }
}
