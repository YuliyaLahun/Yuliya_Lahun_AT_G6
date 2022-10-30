package classwork.day10;


import classwork.day9.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ContinueStream {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        System.out.println(list.stream().anyMatch(x -> x.equals("мама")));
        System.out.println(list.stream().allMatch(x -> x.contains("м")));
        System.out.println(list.stream().map(x -> x + "м").collect(Collectors.toList()));
        System.out.println(list.stream()
                .flatMap(x -> Arrays.stream(x.split("а")))
                .filter(x -> !x.isEmpty())
                .collect(Collectors.toList()));


        System.out.println(list.stream().sorted().collect(Collectors.toList()));
        System.out.println(list.stream().sorted((x, y) -> -x.compareTo(y))
                .distinct()
                .collect(Collectors.toList()));

        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMAN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMAN),
                new Person("Роман Петрович", 72, Person.Sex.MAN)
        );

        people.stream().sorted((p1, p2) -> {
                    if (p1.getSex() != p2.getSex()) {
                        return p1.getSex().compareTo(p2.getSex());
                    } else return p1.getAge() - p2.getAge();
                })
                .peek(x -> System.out.println(x))
                .collect(Collectors.toList());

        String letter = list.stream().flatMap(x -> Arrays.stream(x.split("")))
                .peek(System.out::println)
                .max(String::compareTo)
                .get();

        System.out.println(letter);

        System.out.println(people.stream().min((x, y) -> x.getAge() - y.getAge()).get());
        System.out.println(people.stream().min(Comparator.comparingInt((x -> x.getAge()))).get());

        System.out.println(list.stream().map(x -> x.length())
                .reduce((x, y) -> x + y)
                .get());

        System.out.println(list.stream()
                .mapToInt(x -> x.length() % 2 != 0 ? x.length() : 0)
                .sum());

        System.out.println(list.stream().collect(Collectors.joining(":", "<p>", "</p")));
        System.out.println(people.stream().collect(Collectors.toMap(p1 -> p1.hashCode(), p1 -> p1)));
        System.out.println(people.stream().collect(Collectors.groupingBy(x -> x.getSex())).keySet());

    }
}

