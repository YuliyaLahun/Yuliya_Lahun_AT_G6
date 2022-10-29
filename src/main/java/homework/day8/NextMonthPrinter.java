package homework.day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NextMonthPrinter {

    public static void main(String[] args) {
        Map<Integer, String> months = new HashMap<>();
        months.put(0, "January");
        months.put(1, "February");
        months.put(2, "March");
        months.put(3, "April");
        months.put(4, "May");
        months.put(5, "June");
        months.put(6, "July");
        months.put(7, "August");
        months.put(8, "September");
        months.put(9, "October");
        months.put(10, "November");
        months.put(11, "December");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type name of month to get the next one: ");

        while (scanner.hasNext()) {
            String inputMonth = scanner.nextLine();
            for (Map.Entry<Integer, String> entry : months.entrySet()) {
                if (entry.getValue().equalsIgnoreCase(inputMonth)) {
                    int inputMonthKey = entry.getKey();
                    if (inputMonthKey == 11) {
                        System.out.println(months.get(0));
                    } else
                        System.out.println(months.get(inputMonthKey + 1));
                }
                if (inputMonth.equalsIgnoreCase("stop")) {
                    return;
                }
            }
        }
    }


}
