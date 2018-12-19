package java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CollectionsPredicateLambda {
    public  static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.add("four");

        Predicate<String> p = (str) -> str == "two";

        strings.forEach((str) -> {
            if (p.test(str)) System.out.println(str);
        });
    }
}
