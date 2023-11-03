package lectures.StrategyPattern.java_api_sort_package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortSimulator {

    private static Comparator<Person> personComparator;

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add((new Person("Karlo", "11/11/2005")));
        people.add((new Person("Kleopatra", "2/5/2001")));
        people.add((new Person("alina", "15/3/1986")));
        people.add((new Person("teo", "23/3/1976")));

        personComparator = new DateComparator();
        Collections.sort(people, personComparator);
        people.forEach(System.out::println);
    }
}
