package homework.day8;

import homework.day8.classes.Water;

import java.util.Arrays;
import java.util.List;

public class WaterListRunner {

    public static void main(String[] args) {
        List<Water> waterList = Arrays.asList(new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный"));

        for (Water water : waterList) {
            System.out.println(water.getColor() + "-" + water.getSmell());
        }
    }
}
