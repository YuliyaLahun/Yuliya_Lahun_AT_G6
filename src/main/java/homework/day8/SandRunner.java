package homework.day8;

import homework.day8.classes.Sand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SandRunner {

    public static void main(String[] args) {
        List<Sand> sands = new ArrayList<>();
        sands.add(new Sand(2, "Речной"));
        sands.add(new Sand(4, "Карьерный"));
        sands.add(new Sand(2, "Речной"));
        sands.add(new Sand(7, "Речной"));

        for (Sand sand : sands) {
            System.out.print(sand.getWeight() + " ");
        }
        System.out.println();//for better view of sand

        for (Sand sand : sands) {
            System.out.print(sand.getName() + " ");
        }
        System.out.println();//for better view of sand

        Map<Integer, Sand> sandMap = new HashMap<>();

        for (int i = 0; i < sands.size(); i++) {
            sandMap.put(i, sands.get(i));
        }

        for (int key : sandMap.keySet()) {
            System.out.println(key);
        }

        for (Sand sand : sandMap.values()) {
            System.out.println(sand.toString());
        }

        for (Map.Entry<Integer, Sand> set : sandMap.entrySet()) {
            System.out.println(set);
        }
    }
}
