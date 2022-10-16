package classwork.day6;

// заполнить ОбджектКонтейнер целыми числами,
// затем последовательно извлечь и отпечатать в консоль
public class ObjectContainerRunner {

    public static void main(String[] args) {
        ObjectContainer objectContainer = new ObjectContainer();
        int x = 1;

        while (!objectContainer.isFull()) {
            objectContainer.add(x++);
        }

        while (!objectContainer.isEmpty()) {
            System.out.println(objectContainer.removeLast());
        }
    }


}
