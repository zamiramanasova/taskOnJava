package Task141122;

import java.util.Scanner;

/**
 * 37. Напишите программу на Java для обращения строки.
 */
public class LessonTen {
    public static void main(String[] args) {
        System.out.println("Enter your text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        text = rev(text);
        System.out.println(text);

    }

    public static String rev(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
