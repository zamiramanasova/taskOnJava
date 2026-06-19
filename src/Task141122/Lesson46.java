package Task141122;

import java.time.LocalDateTime;

/**
 * 46. Напишите программу на Java для отображения системного времени.
 */
public class Lesson46 {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());
    }
}
