package lectures.StrategyPattern.java_api_sort_package;

import java.time.LocalDate;
import java.time.Period;

public class Person {

    private static int cntID = 110;
    private int id;
    private String name;
    private int age;
    private LocalDate birthDay;
    private String stringBDay;

    public Person(String name, String stringBDay) {
        this.id = cntID++;
        this.name = name;
        this.stringBDay = stringBDay;
        this.age = calculateAge();

    }

    private int calculateAge() {
        String[] dateParts = stringBDay.split("/");
        int day = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int year = Integer.parseInt(dateParts[2]);
        this.birthDay = LocalDate.of(year, month, day);

        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDay, currentDate);
        return period.getYears();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthDay=" + birthDay +
                '}';
    }
}
