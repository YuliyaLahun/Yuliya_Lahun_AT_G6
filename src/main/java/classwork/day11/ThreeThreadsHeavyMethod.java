package classwork.day11;


import static classwork.day11.RunnerClass.heavyMethod;

public class ThreeThreadsHeavyMethod {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()-> heavyMethod());
        Thread t2 = new Thread(()-> heavyMethod());
        Thread t3 = new Thread(()-> {
            try{
                t1.join();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            heavyMethod();
        });

        t1.start();
        //t1.join();
        t2.start();
        //t2.join();
        t3.start();
        //t3.join();

    }
}
