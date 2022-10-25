package homework.day8;


import java.util.ArrayList;
import java.util.List;

public class Cities {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        for (String s : cities) {
            System.out.println(s);
        }

        int counter = 0;
        for (int i = 0; i < cities.size(); i++) {
            counter += cities.get(i).length();
        }
        System.out.println(counter);

        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }


    }
}
