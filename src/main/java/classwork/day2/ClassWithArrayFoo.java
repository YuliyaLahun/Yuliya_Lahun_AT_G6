import java.util.Random;

public class ClassWithArrayFoo {

    public void foo() {
        int sum = 0;

        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        for (int x : array) {
            sum += x;

        }
        System.out.println(sum);
        System.out.println("Average number is: " + sum / array.length);
    }

}
