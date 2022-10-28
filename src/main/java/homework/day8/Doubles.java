package homework.day8;

import java.util.Arrays;
import java.util.List;

import static java.lang.Math.floor;

public class Doubles {

    public static void main(String[] args) {
        List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        for (double dbl : doubles) {
            System.out.print(dbl + " ");
        }
        System.out.println();//for better view of printed doubles

        double multiply = 1;
        for (int i = 0; i < doubles.size(); i++) {
            multiply *= doubles.get(i);
        }
        System.out.println(multiply);

        double sumOfFractionalParts = 0;
        for (double dbl : doubles) {
            double integerPartOfNumber = floor(dbl);
            sumOfFractionalParts += dbl - integerPartOfNumber;
        }
        System.out.println(sumOfFractionalParts);

        for (int i = 0; i < doubles.size(); i++) {
            System.out.print((int) floor(doubles.get(i)) + " ");
        }
    }
}
