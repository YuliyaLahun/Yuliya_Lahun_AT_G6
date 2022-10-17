package homework.day6;

//- [ ] 1.3 сделать метод, который позволяет найти в тексте все цифры
// и преобразовать их в массив числовых переменных, вывести все элементы массива в косоль,
// текст получает на вход в виде аргумента
public class IntegersPrinter {

    public static void printAllIntegersFromString(String inputString) {
        String[] numbersInString = inputString.split("\\D");
        int counter = 0;
        for (int i = 0; i < numbersInString.length; i++) {
            if (!numbersInString[i].equals("")) {
                counter++;
            }
        }
        int[] numbers = new int[counter];
        int counter2 = 0;
        for (int i = 0; i < numbersInString.length; i++) {
            if (!numbersInString[i].equals("")) {
                numbers[counter2] = Integer.parseInt(numbersInString[i]);
                counter2++;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
