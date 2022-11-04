package homework.day2.cycletask;


import java.util.Arrays;
import java.util.stream.Collectors;

public class PrintArraySquare {

    public void printArraySquare(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= array[i];
            System.out.println(array[i]);
        }
    }

    public void printArraySquareStream(int[] array){
        Arrays.stream(array).map(x-> x*x).peek(System.out::println).boxed().collect(Collectors.toList());
    }
}
