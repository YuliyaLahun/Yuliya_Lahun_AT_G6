package homework.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SixThreadsTask {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            makeNotEvenMousesPeek();
        });
        Thread t2 = new Thread(() -> {
            makeNotEvenMousesPeek();
        });
        Thread t3 = new Thread(() -> {
            makeNotEvenMousesPeek();
        });
        Thread t4 = new Thread(() -> {
            makeNotEvenMousesPeek();
        });
        Thread t5 = new Thread(() -> {
            makeNotEvenMousesPeek();
        });
        Thread t6 = new Thread(() -> {
            makeNotEvenMousesPeek();
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

    }

    private static void makeNotEvenMousesPeek() {
        List<Mouse> mouses = new ArrayList<>();
        for (int i = 1; i <= 26; i++) {
            mouses.add(new Mouse(i));
        }

        Pattern pattern = Pattern.compile("\\d+");


        mouses.stream()
                .filter(x -> {
                    Matcher matcher = pattern.matcher(x.getName());
                    matcher.find();
                    boolean isEven = false;
                    if (Integer.parseInt(matcher.group()) % 2 != 0) {
                        isEven = true;
                    }
                    return isEven;
                })
                .peek(x -> {
                    try {
                        x.peep();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }).collect(Collectors.toList());
    }
}
