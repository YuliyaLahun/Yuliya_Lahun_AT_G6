package bubbles;


public class killArray {
    static int[] array = new int[]{1, 2, 3, 4, 5};

    static void killArray(int[] array) {
        int x = 1;

        for (int i = 0; i <= array.length - 1; i++) {
            int[] array2 = new int[array.length - x];

            System.out.println(array[i]);
            if (i < array.length - 1) {
                array2[i] = array[i];
            }
            x++;

        }
    }


    public static void main(String[] args) {
        //System.out.println(array[1]);
        killArray(array);
    }
}
