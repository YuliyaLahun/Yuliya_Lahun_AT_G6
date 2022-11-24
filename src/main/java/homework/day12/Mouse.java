package homework.day12;

public class Mouse {


    private static final String pattern = "Mouse %s";

    private final String name;

    public String getName() {
        return name;
    }

    public Mouse(int number) {
        this.name = String.format(pattern, number);
    }

    public void peep() throws InterruptedException {
        System.out.printf("%s PEEP!", name);
        Thread.sleep(2000);
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "name='" + name + '\'' +
                '}';
    }
}
