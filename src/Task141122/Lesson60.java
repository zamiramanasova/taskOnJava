package Task141122;

import java.util.Scanner;

/**
 * 60. Напишите программу на Java, чтобы найти
 * предпоследнее (рядом с последним) слово предложения.
 */
public class Lesson60 {
    public static void main(String[] args) {
        System.out.println("Enter text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(lastWord(text));
    }

    public static String lastWord(String text) {
        String last = text.substring(text.lastIndexOf(" ") + 1);
        return last;
    }
}
