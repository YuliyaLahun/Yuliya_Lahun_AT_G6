package cycletask;


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
}
