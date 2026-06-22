package Task141122;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 58. Напишите программу на Java, которая
 * будет использовать первую букву каждого слова в предложении.
 */
public class Lesson58 {
    public static void main(String[] args) {
        System.out.println("Enter text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        upperCaseAllFirstWord(text);
    }

    public static void upperCaseAllFirstWord(String text) {
        String regex  = "\\b(.)(.*?)\\b";
        String result = Pattern.compile(regex).matcher(text).replaceAll(
                matchResult -> matchResult.group(1).toUpperCase() + matchResult.group(2)
        );
        System.out.println(result);
    }
}
