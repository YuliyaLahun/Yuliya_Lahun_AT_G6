package cycletask;

//создать пустой массив типа int и размера n = 7 и заполнить его случайными элементами используя Random.nextInt(n)

import java.util.Random;

public class CreateAndFillArray {

    public int[] createArray() {

        int[] array = new int[7];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }
}
