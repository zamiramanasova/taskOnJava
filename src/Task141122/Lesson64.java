package Task141122;

import java.util.Scanner;

/**
 * 64. Напишите программу на Java, которая принимает два
 * целых числа от 25 до 75 и возвращает true,
 * если в обоих числах есть общая цифра.
 */
public class Lesson64 {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Enter number: ");
        int b = scanner.nextInt();
        if ((a > 25 || a < 75) || (b > 25 || b < 75)) {
            if (a%10 == b%10) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}
