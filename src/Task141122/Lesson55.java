package Task141122;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Scanner;

/**
 * 55. Напишите программу на Java для преобразования
 * секунд в часы, минуты и секунды.
 */
public class Lesson55 {
    public static void main(String[] args) {
        System.out.println("Enter number : ");
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTimeInMillis(a);
//        SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");
//        System.out.println(format.format(calendar.getTime()));

        System.out.println(String.format("%02d:%02d:%02d", a / 3600, a / 60 % 60, a % 60));
    }
}
