package homework.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FiveThreadsRunner {

    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            makeMousesPeek();
        });
        Thread t2 = new Thread(()->{
            makeMousesPeek();
        });
        Thread t3 = new Thread(()->{
            makeMousesPeek();
        });
        Thread t4 = new Thread(()->{
            makeMousesPeek();
        });
        Thread t5 = new Thread(()->{
            makeMousesPeek();
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }

    private static void makeMousesPeek() {
        List<Mouse> mouses = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            mouses.add(new Mouse(i));
        }

        mouses.stream().peek(x-> {
            try {
                x.peep();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).collect(Collectors.toList());
    }
}
