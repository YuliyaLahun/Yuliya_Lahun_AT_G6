package homework.day10;

import java.util.ArrayList;
import java.util.List;

//сгенерировать коллекцию целых чисел (List) из n элементов
// от minValue до maxValue и определить,
// содержаться ли в данной коллекции числа, которые делятся и на 3 и на 5 без остатка с помощь stream
public class GenerateListOfInt {

    public static void main(String[] args) {
        int minValue = 1;
        int maxValue = 15;
        List<Integer> list = new ArrayList<>();
        for (int i = minValue; i <= maxValue; i++) {
            list.add(i);
        }
        System.out.println(list.stream().anyMatch(x -> x % 3 == 0 && x % 5 == 0));

    }
}
