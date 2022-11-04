package homework.day2.cycletask;


import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class PrintReversedArray {

    public void printReversedArray(int[] array) {

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    public void printReversedArrayStream(int[] array){
        System.out.println(Arrays.stream(array).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList()));
    }
}
