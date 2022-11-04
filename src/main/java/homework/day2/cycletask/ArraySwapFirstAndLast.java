package homework.day2.cycletask;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySwapFirstAndLast {

    public void swapFirstAndLastElementOfArray(int[] array) {
        int x = array[0];
        int y = array[array.length - 1];
        array[0] = y;
        array[array.length - 1] = x;
        System.out.println(Arrays.toString(array));
    }

    public static void swapFirstAndLastElementOfArrayCollection(int[] array){
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        Collections.swap(list, 0,array.length-1);
        System.out.println(list);
    }
}

