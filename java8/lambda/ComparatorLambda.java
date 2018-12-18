package java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
}

public class ComparatorLambda {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Vaibhav"));
        people.add(new Person("Vijay"));

        Comparator<Person> c = (p1, p2) -> {
            if(p1.name.equals(p2.name))
                return 0;
            else
                return 1;
        };

        Collections.sort(people, c);
    }
}
