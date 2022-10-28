package homework.day8;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Numbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);

        for (int i : numbers) {
            System.out.println(i);
        }

        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        System.out.println(sum);

        Collections.sort(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();//for better view of printed numbers

        Collections.reverse(numbers);

        for (int i : numbers) {
            System.out.print(i + " ");
        }

    }
}
