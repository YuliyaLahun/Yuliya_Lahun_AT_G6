package homework.day8;

import java.util.ArrayList;
import java.util.List;

public class Countries {

    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");

        for (String s: countries){
            if(countries.indexOf(s) == countries.size()-1){
                System.out.print(s);
            } else
            System.out.print(s+", ");
        }

        System.out.println();//for better view of printed countries
        int counter =0;
        for (String s:countries){
            if(s.length()<7){
                counter++;
            }
        }
        System.out.println(counter);

        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }
    }
}
