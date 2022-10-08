package cycletask;


public class PrintArraySquare {

    public void printArraySquare(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Math.pow(array[i], 2));
        }
    }
}
