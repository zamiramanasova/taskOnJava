package Task141122;

import java.util.Scanner;

/**
 * 54. Напишите программу на Java, которая принимает
 * три целых числа от пользователя и возвращает true,
 * если два или более из них (целые числа) имеют
 * одинаковую самую правую цифру.
 * Целые числа неотрицательны.
 */
public class Lesson54 {
    public static void main(String[] args) {
        System.out.println("Enter number : ");
        Scanner scanner = new Scanner(System.in);
        int a = 1; //scanner.nextInt();
        System.out.println("Enter number :");
        int b = 10;//scanner.nextInt();
        System.out.println("Enter number :");
        int c = 14; //scanner.nextInt();
        System.out.println(countNumber(a,b,c, true));
    }
    private static boolean countNumber(int p, int q, int r, boolean end) {
        return (p % 10 == q % 10) || (p % 10 == r % 10) || (q % 10 == r % 10);
    }
}
