package homework.day12;

import java.util.ArrayList;
import java.util.List;

public class Task1_4 {

    private static int numberOfMouses = 3;

    public static void main(String[] args) throws InterruptedException {
        List<Mouse> mouses = new ArrayList<>();
        for (int i = 1; i <= numberOfMouses; i++) {
            mouses.add(new Mouse(i));
        }

        Thread t1 = new Thread(()->{
            peepAndRemove(mouses);
        });

        Thread t2 = new Thread(()->{
            peepAndRemove(mouses);
        });

        Thread t3 = new Thread(()->{
            peepAndRemove(mouses);
        });

        Thread t4 = new Thread(()->{
            peepAndRemove(mouses);
        });

        Thread t5 = new Thread(()->{
            peepAndRemove(mouses);
        });


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }

    private static void peepAndRemove(List<Mouse> mouses) {
        while(!mouses.isEmpty()){
            Mouse mouse = mouses.stream().findAny().get();
            try {
                mouse.peep();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mouses.remove(mouse);
            try {
                Thread.currentThread().sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
