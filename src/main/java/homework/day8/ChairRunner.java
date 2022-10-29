package homework.day8;

import homework.day8.classes.Chair;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChairRunner {

    public static void main(String[] args) {
        List<Chair> chairs = Arrays.asList(new Chair(1, 2),
                new Chair(4, 2),
                new Chair(2, 4));

        for (Chair chair : chairs) {
            System.out.println(chair.getHeight() * chair.getWidth());
        }

        Map<Integer, Chair> chairMap = new HashMap<>();
        for (int i = 0; i < chairs.size(); i++) {
            chairMap.put(i, chairs.get(i));
        }

        for (int key : chairMap.keySet()) {
            System.out.println(key);
        }

        for (Chair chair : chairMap.values()) {
            System.out.println(chair);
        }

        for (Map.Entry<Integer, Chair> set : chairMap.entrySet()) {
            System.out.println(set);
        }
    }
}
