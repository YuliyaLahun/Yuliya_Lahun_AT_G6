package homework.day2.cycletask;

import java.util.Arrays;

public class ArraySwapFirstAndLast {

    public void swapFirstAndLastElementOfArray(int[] array) {
        int x = array[0];
        int y = array[array.length - 1];
        array[0] = y;
        array[array.length - 1] = x;
        System.out.println(Arrays.toString(array));
    }
}

