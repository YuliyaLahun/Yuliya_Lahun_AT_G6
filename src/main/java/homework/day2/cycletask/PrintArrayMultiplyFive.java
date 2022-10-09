package cycletask;


public class PrintArrayMultiplyFive {

    public void arrayMultiplyFive(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i]*=5;
            System.out.println(array[i]);
        }
    }
}
