package homework.day12;

import java.util.Arrays;
import java.util.List;

public class Mouse {

    private static String pattern = "Mouse \\d";

    public String getName() {
        return name;
    }

    private String name = pattern.substring(0,5);

    public Mouse(int number){
        this.name = name + " " + number;
    }

    public void peep() throws InterruptedException {
        List<String> list = Arrays.asList(name.split("Mouse "));
        int numberOfMouse = list.stream()
                .filter(x->!x.equals(""))
                .map(Integer::parseInt)
                .findFirst()
                .get();
        System.out.printf("Mouse %d PEEP!",numberOfMouse);
        Thread.currentThread().sleep(2000);
    }
}
