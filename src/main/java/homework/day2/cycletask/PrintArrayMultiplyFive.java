package homework.day2.cycletask;


import java.util.Arrays;
import java.util.stream.Collectors;

public class PrintArrayMultiplyFive {

    public void arrayMultiplyFive(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i]*=5;
            System.out.println(array[i]);
        }
    }

    public void printStreamMultiplyFive(int[] array){
        Arrays.stream(array).map(x-> x*5).peek(System.out::println).boxed().collect(Collectors.toList());
    }
}
