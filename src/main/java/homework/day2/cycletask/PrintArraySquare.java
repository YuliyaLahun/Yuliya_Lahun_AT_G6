package homework.day2.cycletask;


public class PrintArraySquare {

    public void printArraySquare(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= array[i];
            System.out.println(array[i]);
        }
    }
}
