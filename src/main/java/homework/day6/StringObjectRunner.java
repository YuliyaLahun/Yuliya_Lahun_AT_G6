package homework.day6;


import java.text.ParseException;

public class StringObjectRunner {

    public static void main(String[] args) throws ParseException {
        ShowCurrentDate now = new ShowCurrentDate();
        now.showCurrentDateTime();

        DateFormatter dateFormatter = new DateFormatter();
        dateFormatter.formatDate("22.00 07.09.2020");
    }

}
