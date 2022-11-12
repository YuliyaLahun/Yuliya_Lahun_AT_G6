package homework.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Task1_6 {

    static Object lock = new Object();
    private static int numberOfMouses = 420;
    private static Pattern pattern = Pattern.compile("\\d+");

    public static void main(String[] args) throws InterruptedException {

        List<Mouse> mouses = new ArrayList<>();
        for (int i = 1; i <= numberOfMouses; i++) {
            mouses.add(new Mouse(i));
        }

        List<Mouse> evenMouses = mouses.stream()
                .filter(x -> {
                    Matcher matcher = pattern.matcher(x.getName());
                    matcher.find();
                    return Integer.parseInt(matcher.group()) % 2 == 0;
                })
                .collect(Collectors.toList());

        Thread t1 = new Thread(() -> {
            peepAndRemoveUnEvenMouse(mouses, evenMouses);
        });

        Thread t2 = new Thread(() -> {
            peepAndRemoveUnEvenMouse(mouses, evenMouses);
        });
        Thread t3 = new Thread(() -> {
            peepAndRemoveUnEvenMouse(mouses, evenMouses);
        });
        Thread t4 = new Thread(() -> {
            peepAndRemoveUnEvenMouse(mouses, evenMouses);
        });
        Thread t5 = new Thread(() -> {
            peepAndRemoveUnEvenMouse(mouses, evenMouses);
        });
        Thread t6 = new Thread(() -> {
            peepAndRemoveUnEvenMouse(mouses, evenMouses);
        });


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

    }

    private static void peepAndRemoveUnEvenMouse(List<Mouse> mouses, List<Mouse> evenMouses) {

        while (!evenMouses.isEmpty()) {
            synchronized (lock) {
                try {
                    evenMouses.get(0).peep();
                    mouses.remove(evenMouses.get(0));
                    evenMouses.remove(0);
                    System.out.println(Thread.currentThread().getName());
                    Thread.currentThread().sleep(170);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }

}
