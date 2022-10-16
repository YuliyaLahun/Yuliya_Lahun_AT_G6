package homework.day6;

//сделать метод, который позволяет отпечатать в консоль
// все буквы в стобик из строки текста, которую принимает на вход в виде аргумента
public class CharPrinter {

    public static void printCharsFromString(String inputString){
        String[] strings = inputString.split("");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }

}
