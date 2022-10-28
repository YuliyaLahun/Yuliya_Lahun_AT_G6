package homework.day8;

import homework.day8.classes.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonListRunner {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(32, "Коля"));
        personList.add(new Person(24, "Оля"));
        personList.add(new Person(55, "Вася"));
        personList.add(new Person(63, "Маша"));

        for (Person person : personList) {
            System.out.print(person.getAge() + " ");
        }
        System.out.println();//for better view of printed persons

        for (Person person : personList) {
            System.out.print(person.getName() + " ");
        }
        System.out.println();//for better view of printed persons

        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i).toString());
        }

    }
}
