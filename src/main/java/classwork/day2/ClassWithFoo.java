public class ClassWithFoo {

    public void foo() {
        int y = 0;
        for (int i = 23; i < 28; i++) {
            if (i % 13 == 0) {
                System.out.println("continue!");
                break;
                //return;
                //continue;

            }
            System.out.println("i is: " + i);
            y = i;
        }
        System.out.println("number is: " + y);
    }
}
