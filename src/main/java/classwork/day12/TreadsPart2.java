package classwork.day12;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TreadsPart2 {

    private static int sum = 0;

    public static void main(String[] args) {

        Map<Integer, Integer> integerMap = new ConcurrentHashMap<>();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10_000; i++) {
                integerMap.put(i, i + 1);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10_000; i++) {
                integerMap.forEach((k, v) -> sum += v);
            }
        });

        t1.start();
        t2.start();

        System.out.println(sum);
    }
}
