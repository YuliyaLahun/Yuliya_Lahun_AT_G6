package classwork.day12;

public class CounterTask {

    private static int counter;


    public static void main(String[] args) throws InterruptedException {

        Object lock = new Object();


        Thread t1 = new Thread(()->{
            synchronized (lock){
                for (int i = 0; i < 1_000_000; i++) {
                    counter++;
                }
            }
        });

        Thread t2 = new Thread(()->{
            synchronized (lock){
                for (int i = 0; i < 1_000_000; i++) {
                    counter--;
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter);
    }
}
