package classwork.day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TrainStream {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        System.out.println(list.stream().filter(x -> x.equals("мама")).count());
        System.out.println(list.stream().filter("мама"::equals).count());

        System.out.println(list.stream().findFirst().orElse("мама"));
        System.out.println(list.stream().filter(x -> x.equals("мама")).findFirst().get());
        System.out.println(list.stream().skip(4).findFirst().get());
        System.out.println(list.stream().skip(2).limit(2).collect(Collectors.toList()));
        System.out.println(list.stream().filter(x -> x.contains("м")).distinct().collect(Collectors.toList()));

    }

}
