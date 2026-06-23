package Task141122;

import java.util.Scanner;

/**
 * 62. Напишите программу на Java, которая принимает три
 * целочисленных значения и возвращает true, если одно из
 * них равно 20 или больше и меньше вычитаний других.
 */
public class Lesson62 {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Enter number: ");
        int b = scanner.nextInt();
        System.out.println("Enter number: ");
        int c = scanner.nextInt();

        if((Math.abs(a - b) >= 20 || Math.abs(b - c) >= 20 || Math.abs(c - a) >= 20)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
