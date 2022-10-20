package homework.day6;

//- [ ] 1.3 сделать метод, который позволяет найти в тексте все цифры
// и преобразовать их в массив числовых переменных, вывести все элементы массива в косоль,
// текст получает на вход в виде аргумента
public class IntegersPrinter {

    public static void printAllIntegersFromString(String inputString) {
        String[] numbersInString = inputString.split("\\D");
        int counter = 0;
        for (String s : numbersInString) {
            if (!s.equals("")) {
                counter++;
            }
        }
        int[] numbers = new int[counter];
        int counter2 = 0;
        for (String s : numbersInString) {
            if (!s.equals("")) {
                numbers[counter2] = Integer.parseInt(s);
                counter2++;
            }
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
