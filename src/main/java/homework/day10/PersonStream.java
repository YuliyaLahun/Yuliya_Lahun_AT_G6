package homework.day10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class PersonStream {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            people.add(new Person(getRandomNumberUsingNextInt(15, 31), "name" + i, "surname" + i));
        }

        System.out.println(people.stream()
                .filter(x -> x.getAge() > 21)
                .peek(x -> System.out.println("name" + x.getName() + " age:" + x.getAge()))
                .sorted(Comparator.comparing(Person::getSurname).thenComparing(Person::getName))
                .limit(4)
                .map(Person::getName)
                .collect(Collectors.toList()));

    }

    public static int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

}
