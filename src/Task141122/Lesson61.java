package Task141122;

import java.util.Scanner;

/**
 * 61. Напишите программу на Java, чтобы перевернуть слово.
 */
public class Lesson61 {
    public static void main(String[] args) {
        System.out.println("Enter text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(reverse(text));
    }

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
