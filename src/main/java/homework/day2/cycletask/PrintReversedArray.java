package cycletask;


public class PrintReversedArray {

    public void printReversedArray(int[] array) {

        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
