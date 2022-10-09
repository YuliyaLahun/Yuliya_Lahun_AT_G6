package cycletask;

//используя for вывести в консоль каждое нечетное число от 3 до 19 включительно
public class TrainFor {
    public void printOddNumbers() {
        for (int i = 3; i <= 19; i += 2) {
            System.out.print(i + " ");
        }
    }
}
