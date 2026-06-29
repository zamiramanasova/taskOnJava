package Task141122;

import java.util.Scanner;

/**
 * 53. Напишите программу на Java, которая принимает
 * три целых числа от пользователя и возвращает true,
 * если второе число больше первого числа, а третье
 * число больше второго числа. Если «abc» истинно, второе
 * число не должно быть больше первого числа.
 */
public class Lesson53 {
    public static void main(String[] args) {
        System.out.println("Enter number : ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Enter number :");
        int b = scanner.nextInt();
        System.out.println("Enter number :");
        int c = scanner.nextInt();
        System.out.println(count(a,b,c));
    }

    public static boolean count(int a, int b, int c) {
        if (a < b & b < c) {
            return true;
        } else {
            return false;
        }
    }
}
