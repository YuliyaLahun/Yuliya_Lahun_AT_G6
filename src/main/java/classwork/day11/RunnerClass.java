package classwork.day11;


import java.util.stream.IntStream;

import static java.lang.Math.atan;
import static java.lang.Math.tan;

public class RunnerClass {

    public static void main(String[] args) {
        Thread thread1 = new Thread(() ->
                IntStream.range(1, 100).forEach(x -> System.out.println("t1: " + x)));
        //thread1.yield();

        Thread thread2 = new Thread(() ->
                IntStream.range(1, 100).forEach(x -> System.out.println("t2: " + x)));

        Thread thread3 = new Thread(() ->
                IntStream.range(1, 100).forEach(x -> System.out.println("t3: " + x)));

//        thread1.start();
//        thread2.start();
//        thread3.start();

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                heavyMethod();
            })
                    .start();
        }
    }

    public static void heavyMethod() {
        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 100_000_000; i++) {
            double d = tan(atan(123456789.123456789));
        }

        System.out.printf("I am %s, and I have finished in %s millis \r\n",
                Thread.currentThread().getName(),
                (System.currentTimeMillis() - t0));
    }
}
