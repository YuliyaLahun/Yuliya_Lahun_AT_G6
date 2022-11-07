package homework.day12;

import java.util.Arrays;
import java.util.List;

public class Hedgehog {

    private String pattern = "Hedgehog \\d";
    private String name = "Hedgehog";

    public Hedgehog(int number){
        this.name = name + " " + number;
    }

    public void tellMe() throws InterruptedException {
        List<String> list = Arrays.asList(name.split("\\d"));
        int numberOfHedgehog = list.stream().filter(x->x.startsWith("H")).map(Integer::parseInt).findFirst().get();
        System.out.printf("I am Hedgehog %d!",numberOfHedgehog);
        Thread.currentThread().sleep(50);
    }
}
