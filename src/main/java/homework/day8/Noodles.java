package homework.day8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Noodles {

    public static void main(String[] args) {
        List<String> noodles = new ArrayList<>();
        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");

        for (String s : noodles) {
            if (noodles.indexOf(s) == noodles.size() - 1) {
                System.out.println(s);
            } else
                System.out.print(s + "-");
        }

        for (int i = 0; i < noodles.size(); i++) {
            noodles.set(i, changeAtoO(noodles.get(i)));
        }

        for (int i = 0; i < noodles.size(); i++) {
            System.out.print(noodles.get(i) + " ");
        }

    }

    private static String changeAtoO(String noodle) {
        List<Character> charsFromNoodle = new ArrayList<>();
        for (char ch : noodle.toCharArray()){
            charsFromNoodle.add(ch);
        }
        for (int i = 0; i < charsFromNoodle.size(); i++) {
            if (charsFromNoodle.get(i) == 'a') {
                charsFromNoodle.set(i, 'o');
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character character: charsFromNoodle){
            sb.append(character);
        }
        return sb.toString();
    }
}
