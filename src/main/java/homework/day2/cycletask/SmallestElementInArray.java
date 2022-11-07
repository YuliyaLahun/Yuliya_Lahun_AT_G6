package homework.day2.cycletask;


import java.util.Arrays;

public class SmallestElementInArray {


    public void findSmallestElementInArray(int[] array) {
        int x = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (x >= array[i]) {
                x = array[i];
            }
        }
        System.out.println(x);
    }

    public void findSmallestElementInArrayStream(int[] array) {
        System.out.println("min element in array is: " + Arrays.stream(array).min().getAsInt());
    }
}
