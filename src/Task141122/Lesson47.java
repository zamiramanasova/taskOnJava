package Task141122;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * Напишите программу на Java для отображения
 * текущей даты и времени в определенном формате.
 */
public class Lesson47 {
    public static void main(String[] args) {
        SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));

        System.out.println("\nNow: "+cdt.format(System.currentTimeMillis()));
    }
}
