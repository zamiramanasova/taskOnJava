package Task141122;

import java.util.Scanner;

/**
 * 59. Напишите программу на Java для
 * преобразования заданной строки в строчные.
 */
public class Lesson59 {
    public static void main(String[] args) {
        System.out.println("Enter text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(text.toLowerCase());
    }
}
