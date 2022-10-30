package homework.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//- [ ] - для всех четных значений длин от 1 до 20 дюймов
// (работаем с int) вывести в консоль значения в дюймах,
// певерести значения в сантиметры (работаем с double) и найти сумму
public class InchesTask {

    public static void main(String[] args) {
        List<Integer> inches = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            inches.add(i);
        }
        System.out.println(inches.stream()
                .filter(x -> x % 2 == 0)
                .mapToDouble(x -> x * 2.54).sum());
    }
}
