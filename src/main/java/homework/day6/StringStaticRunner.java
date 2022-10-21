package homework.day6;

public class StringStaticRunner {

    public static void main(String[] args) {
        String inputString = "asndsjg";

        CharPrinter.printCharsFromString(inputString);

        DuplicatesPrinter.shouldPrintDuplicatesInString("mama myla ramu mama");

        IntegersPrinter.printAllIntegersFromString("ads1123sd123d4 8!3");

        LogsTask.showLogsStatistics("access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.122.6 denied");
    }
}
