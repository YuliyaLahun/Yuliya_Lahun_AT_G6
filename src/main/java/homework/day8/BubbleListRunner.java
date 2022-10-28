package homework.day8;

import homework.day8.classes.Bubble;

import java.util.Arrays;
import java.util.List;

public class BubbleListRunner {

    public static void main(String[] args) {
        List<Bubble> bubbles = Arrays.asList(new Bubble(2, "CO2"),
                new Bubble(4, "O2"),
                new Bubble(5, "CO"));

        for (Bubble bubble : bubbles) {
            System.out.print(bubble.getVolume() + " ");
        }
        System.out.println();//for better view of printed bubbles

        for (Bubble bubble : bubbles) {
            System.out.print(bubble.getName() + " ");
        }
        System.out.println();//for better view of printed bubbles


        int commonVolume = 0;
        for (Bubble bubble : bubbles) {
            commonVolume += bubble.getVolume();
        }
        System.out.println(commonVolume);

        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(bubbles.get(i).toString());
        }
    }
}
