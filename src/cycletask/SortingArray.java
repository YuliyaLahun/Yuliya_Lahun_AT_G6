package cycletask;


import java.util.Arrays;

public class SortingArray {

    public void sortArray(int[] array, int arrayLength) {
        for (int j = 0; j < arrayLength; j++) {

            for (int i = 0; i <= array.length - 2; i++) {
                int first = array[i];
                int next = array[i + 1];
                if (array[i] < array[i + 1]) {
                    array[i + 1] = first;
                    array[i] = next;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                int tmp = 0;
//                if (arr[i] > arr[j]) {
//                    tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

}
