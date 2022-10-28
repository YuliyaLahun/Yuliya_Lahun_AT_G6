package homework.day8;

import java.util.Arrays;
import java.util.List;

public class Birds {


    public static void main(String[] args) {
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        for (String s : birds) {
            System.out.println("--" + s + "--");
        }

        int counter = 0;
        for (String s : birds) {
            if (containsMoreThanOneVowel(s)) {
                counter++;
            }
        }
        System.out.println(counter);

        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }

        birds.set(3, "Синица");

        System.out.println();//for better view of printed birds
        for (String s : birds) {
            System.out.print(s + " ");
        }
    }

    public static boolean containsMoreThanOneVowel(String string) {
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            // check if char[i] is vowel
            if (string.charAt(i) == 'а' || string.charAt(i) == 'о'
                    || string.charAt(i) == 'у'
                    || string.charAt(i) == 'ы'
                    || string.charAt(i) == 'э'
                    || string.charAt(i) == 'е'
                    || string.charAt(i) == 'я'
                    || string.charAt(i) == 'ё'
                    || string.charAt(i) == 'ю'
                    || string.charAt(i) == 'и') {
                counter++;
            }
        }
        if (counter > 1) {
            return true;
        } else return false;

    }
}