package lectures.StrategyPattern.java_api_sort_package;

import java.util.Comparator;

public class DateComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getBirthDay().compareTo(o2.getBirthDay());
    }
}
