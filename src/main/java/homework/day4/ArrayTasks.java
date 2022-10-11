package day4;

import java.util.Arrays;
import java.util.Calendar;

public class ArrayTasks {

    public static void main(String[] args) {
        ArrayTasks arrayTask = new ArrayTasks();
        int[] array = new int[]{5, 1, 2, 3, 4, 10};
        arrayTask.countSumOfNElemenetsInArray(array, 2);
        arrayTask.arrayWithElementsMoreThanN(array, 1);
        System.out.println(arrayTask.shouldReturnSumOfAllElementsDividedOnCurrentMonthNumber(array));
        arrayTask.printCow();
    }

    public void countSumOfNElemenetsInArray(int[] array, int n) {
        int sum = 0;
        if (n == 0) {
            System.out.println(array[0]);
        } else if (n < 0 || n >= array.length) {
            System.out.println("Value of n is inappropriate");
        } else {
            for (int i = 1; i < array.length; i++) {
                if (i % n == 0) {
                    sum += array[i];
                }
            }
            System.out.println(sum);
        }
    }

    public int[] arrayWithElementsMoreThanN(int[] array, int n) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > n) {
                counter++;
            }
        }
        int[] arrayToReturn = new int[counter];
        int indexForArrayToReturn = counter - 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > n) {
                arrayToReturn[indexForArrayToReturn] = array[i];
                indexForArrayToReturn--;
            }
        }
        System.out.println(Arrays.toString(arrayToReturn));
        return arrayToReturn;
    }

    public int shouldReturnSumOfAllElementsDividedOnCurrentMonthNumber(int[] array) {
        int currentMonthNumber = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % currentMonthNumber == 0) {
                sum += array[i];
            }
        }
        return sum;
    }

//            ^__^
//            (oo)\\_______
//            (__)\ ) \/\  \
//            ||----w |\
//            ||     ||


    public void printCow() {
        System.out.println("^__^");
        System.out.println("(oo)\\\\_______");
        System.out.println("(__)\\ ) \\/\\  \\");
        System.out.println("||----w |\\");
        System.out.println("||     ||");
    }

}
