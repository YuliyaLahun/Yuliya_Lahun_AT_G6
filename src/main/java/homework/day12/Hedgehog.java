package homework.day12;

public class Hedgehog {

    private String pattern = "Hedgehog %s";
    private String name;

    public Hedgehog(int number) {

        this.name = String.format(pattern, number);
    }

    public void tellMe() throws InterruptedException {

        System.out.printf("I am " + name + "!");
        Thread.currentThread().sleep(50);
    }
}
