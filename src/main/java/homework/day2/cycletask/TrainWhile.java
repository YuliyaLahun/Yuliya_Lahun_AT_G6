package homework.day2.cycletask;
// используя while вывести в консоль все числа от 0 до 20 в 1 строку через пробел

public class TrainWhile {

    public void whileReturnsNumbers() {
        int counter = 0;
        while (counter >= 0 && counter <= 20) {
            System.out.print(counter + " ");
            counter++;
        }
    }
}
