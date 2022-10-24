package classwork.day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyFirstSet {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<String>();
        String[] words = "мама мыла раму мыла".split(" ");
        for (String s : "мама мыла раму мыла".split(" ")) {
            mySet.add(s);
        }
        for (String s : mySet) {
            System.out.println(s);
        }

        Iterator iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
