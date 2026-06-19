package Task141122;

import java.util.Scanner;

/**
 * 49. Напишите программу на Java, которая принимает число и
 * проверяет, является ли число четным или нет.
 * Печатает 1, если число четное, или 0, если число нечетное.
 */
public class Lesson49 {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("четное");
        } else {
            System.out.println("нечетное");
        }
    }
}
