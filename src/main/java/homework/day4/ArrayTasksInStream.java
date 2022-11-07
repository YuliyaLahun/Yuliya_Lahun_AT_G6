package homework.day4;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayTasksInStream {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 11};
        int ennyjElemet = 1;
        int n = 2;

        getSumOfEachNElement(array, ennyjElemet);

        getArrayOfElemetsMoreThanN(array, n);

        shouldReturnSumOfAllElementsDividedOnCurrentMonthNumber(array);

    }

    //- [x] -- написать метод, который вернет сумму тех элементов целочисленного массива,
    // которые кратны числу текущего месяца (массив подается в сигнатуру метода)
    private static void shouldReturnSumOfAllElementsDividedOnCurrentMonthNumber(int[] array) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        int currentMonthNumber = Calendar.getInstance().get(Calendar.MONTH) + 1;
        System.out.println(list.stream().filter(x -> x % currentMonthNumber == 0).reduce((x, y) -> x + y).get());
    }


    //написать метод, который вернет целочисленный массив, состоящий только из тех элементов
    // исходного целочисленного массива (подается на вход этого метода),
    // которые больше, чем число n, где n - целое число, передаваемое в сигнатуру этого метода,
    // элементы в результирующем массиве должны быть расположены в обратном порядке
    private static void getArrayOfElemetsMoreThanN(int[] array, int n) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        System.out.println(list.stream().filter(x -> x > n).sorted((x, y) -> y - x).collect(Collectors.toList()));
    }

    ///- [x] -- написать метод, который принимает на вход целочисленном массив
    // и считает сумму каждого n-ого элемента в нем,
    // где n - целое число, передаваемое в сигнатуру этого метода
    private static void getSumOfEachNElement(int[] array, int ennyjElement) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        System.out.println(list.stream().filter(x -> x % ennyjElement == 0).reduce((x, y) -> x + y).get());
    }
}
