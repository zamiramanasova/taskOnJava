package Task141122;

import java.util.Scanner;

/**
 * 41. Напишите программу на Java
 * для печати значения ascii данного символа.
 */
public class Lesson41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        char character = name.charAt(0);
        int number = (int) character;
        System.out.println("Ascii : " + number);
    }
}
