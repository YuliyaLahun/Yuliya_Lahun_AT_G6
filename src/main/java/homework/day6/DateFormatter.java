package homework.day6;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

//September, 7, 2020 22:00
public class DateFormatter {

    DateFormat formatter = new SimpleDateFormat("hh.mm dd.MM.yyyy");
    DateFormat dateFormat = new SimpleDateFormat("MMMMM, d, yyyy kk:mm", Locale.ENGLISH);

    public void formatDate(String input) throws ParseException {
        Date date = formatter.parse(input);
        String text = dateFormat.format(date);
        System.out.println(text);
    }
}
