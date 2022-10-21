package homework.day6;

import java.util.Calendar;

//Сейчас на дворе: 19 сентября, 2020, 3 часа 13 минут
public class ShowCurrentDate {

    Calendar calendar = Calendar.getInstance();
    public int day = calendar.get(Calendar.DAY_OF_MONTH);
    public int month = calendar.get(Calendar.MONTH);
    public int year = calendar.get(Calendar.YEAR);
    public int hour = calendar.get(Calendar.HOUR);
    public int minutes = calendar.get(Calendar.MINUTE);

    public void showCurrentDateTime() {
        System.out.println("Сейчас на дворе: " + day + " " + getMonthInRussian(month) + ", " + year + ", "
                + hour + " " + getHourInRussian(hour) + " " + minutes + " " + getMinuteInRussian(minutes));
    }

    public String getMonthInRussian(int month) {
        switch (month) {
            case 0:
                return "января";
            case 1:
                return "февраля";
            case 2:
                return "марта";
            case 3:
                return "апреля";
            case 4:
                return "мая";
            case 5:
                return "июня";
            case 6:
                return "июля";
            case 7:
                return "августа";
            case 8:
                return "сентября";
            case 9:
                return "октября";
            case 10:
                return "ноября";
            case 11:
                return "декабря";
            default:
                return "";

        }
    }

    public String getHourInRussian(int hour) {
        String chas = null;
        if (hour == 1) {
            chas = "час";
        } else if (hour > 1 && hour < 5) {
            chas = "часа";
        } else if (hour >= 5 || hour == 0) {
            chas = "часов";
        }
        return chas;
    }

    public String getMinuteInRussian(int minutes) {
        String minuty = null;
        if (hour == 1) {
            minuty = "минута";
        } else if (hour > 1 && hour < 5) {
            minuty = "минуты";
        } else if (hour >= 5 || hour == 0) {
            minuty = "минут";
        }
        return minuty;
    }
}
