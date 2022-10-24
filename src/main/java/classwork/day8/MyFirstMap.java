package classwork.day8;

import java.util.HashMap;
import java.util.Map;

public class MyFirstMap {

    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<Integer, String>();
        String[] words = "мама мыла раму мыла".split(" ");
        for (int i = 0; i < words.length; i++) {
            myMap.put(i, words[i]);
        }

        for (int i : myMap.keySet()) {
            System.out.println(i);
        }

        for (String s : myMap.values()) {
            System.out.println(s);
        }

        for (Map.Entry<Integer, String> set : myMap.entrySet()) {
            System.out.println(set);
        }
    }
}
