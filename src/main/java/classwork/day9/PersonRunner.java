package classwork.day9;


import java.util.Arrays;
import java.util.List;

public class PersonRunner {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMAN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMAN),
                new Person("Роман Петрович", 72, Person.Sex.MAN)
        );

        int counter = 0;
        for (Person person : people) {
            if (person.getAge() > 18 && ((person.getSex() == Person.Sex.WOMAN && person.getAge() < 55)
             || (person.getSex() == Person.Sex.MAN && person.getAge() < 60))){
                    counter++;
                }
        }

        System.out.println(counter);

        System.out.println(people.stream()
                .filter(x -> x.getAge() > 18)
                .filter(x -> (x.getSex() == (Person.Sex.WOMAN) && x.getAge() < 55)
                        || (x.getSex() == (Person.Sex.MAN) && x.getAge() < 60) )
                .count());

    }
}
