package homework.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//сгенерировать коллекцию целых чисел (List) из n элементов
// от minValue до maxValue и определить,
// содержаться ли в данной коллекции числа, которые делятся и на 3 и на 5 без остатка с помощь stream
public class GenerateListOfInt {

    public static void main(String[] args) {

        int minValue = 1;
        int maxValue = 15;

        List<Integer> list = IntStream.rangeClosed(minValue, maxValue).boxed().collect(Collectors.toList());

        System.out.println("Содержатся числа, которые делятся и на 3 и на 5 без остатка: "
                + list.stream().anyMatch(x -> x % 3 == 0 && x % 5 == 0));

    }
}
