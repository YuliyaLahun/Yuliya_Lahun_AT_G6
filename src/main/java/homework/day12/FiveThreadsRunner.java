package homework.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FiveThreadsRunner {

    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
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

        });
        t1.start();
    }
}
