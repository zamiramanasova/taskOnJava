package Task141122;

import java.util.Scanner;

/**
 * 63. Напишите программу на Java, которая принимает два целочисленных значения от
 * пользователя и возвращает большие значения. Однако, если два значения одинаковы,
 * вернуть 0 и вернуть меньшее значение, если два значения имеют одинаковый
 * остаток при делении на 6.
 */
public class Lesson63 {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Enter number: ");
        int b = scanner.nextInt();
        if (Math.abs(a) == Math.abs(b)) {
            System.out.println(0);
        } else if (a%6 == b%6) {
            System.out.println(Math.min(a, b));
        } else {
            System.out.println("dont correct");
        }
    }
}
