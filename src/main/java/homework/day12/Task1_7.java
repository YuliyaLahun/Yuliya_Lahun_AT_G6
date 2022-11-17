package homework.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1_7 {

    public static void main(String[] args) {

        List<Mouse> mouses = new ArrayList<>();
        for (int i = 1; i <= 240; i++) {
            mouses.add(new Mouse(i));
        }

        List<Mouse> unEvenMouses = mouses.stream()
                .filter(mouse ->
                        Integer.valueOf(mouse.getName().substring(mouse.getName().lastIndexOf(" ") + 1)) % 2 != 0)
                .collect(Collectors.toList());

        List<Mouse> evenMouses = mouses.stream()
                .filter(mouse ->
                        Integer.valueOf(mouse.getName().substring(mouse.getName().lastIndexOf(" ") + 1)) % 2 == 0)
                .collect(Collectors.toList());

        Object lock = new Object();

        Thread t1 = new Thread(() -> {

            while (!unEvenMouses.isEmpty()) {
                synchronized (lock) {
                    peekAndDelete(mouses, unEvenMouses);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            while (!unEvenMouses.isEmpty()) {
                synchronized (lock) {
                    peekAndDelete(mouses, unEvenMouses);
                }
            }
        });

        Thread t3 = new Thread(() -> {
            while (!unEvenMouses.isEmpty()) {
                synchronized (lock) {
                    peekAndDelete(mouses, unEvenMouses);
                }
            }
        });

        Thread t4 = new Thread(() -> {
            while (!evenMouses.isEmpty()) {
                synchronized (lock) {
                    peekAndDeleteAndCreateHadgehock(mouses, evenMouses);
                }
            }
        });

        Thread t5 = new Thread(() -> {
            while (!evenMouses.isEmpty()) {
                synchronized (lock) {
                    peekAndDeleteAndCreateHadgehock(mouses, evenMouses);
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }

    private static void peekAndDeleteAndCreateHadgehock(List<Mouse> mouses, List<Mouse> evenMouses) {
        try {
            Mouse mouse = evenMouses.get(0);
            int n = Integer.valueOf(mouse.getName().substring(mouse.getName().lastIndexOf(" ") + 1));
            mouse.peep();
            mouses.remove(mouse);
            evenMouses.remove(mouse);
            Hedgehog ezh = new Hedgehog(n);
            ezh.tellMe();
            Thread.currentThread().sleep(250);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void peekAndDelete(List<Mouse> mouses, List<Mouse> unEvenMouses) {
        try {
            Mouse mouse = unEvenMouses.get(0);
            mouse.peep();
            mouses.remove(mouse);
            unEvenMouses.remove(mouse);
            Thread.currentThread().sleep(250);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
