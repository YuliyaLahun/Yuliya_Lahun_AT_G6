package homework.day6;


public class DuplicatesPrinter {

    public static void shouldPrintDuplicatesInString(String inputString) {
        String[] words = inputString.split(" ");
        //System.out.println(Arrays.toString(words));

        for (int i = 0; i < words.length; i++) {
            for (int j = 1; j < words.length; j++) {
                if (i != j && words[i].equals(words[j])) {
                    System.out.println(words[i]);
                }
            }

        }
    }
}
