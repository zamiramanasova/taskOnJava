package Task141122;

import java.util.Scanner;

/**
 * Task 1,2,3,4,5
 */
public class LessonOne {
    public static void main(String[] args) {
//        System.out.println("Hello");
//        System.out.println("Keldibaeva Zamira");
//        int a = 74;
//        int b = 36;
//        System.out.println(a + b);
//        System.out.println(a);
//        int a = 50;
//        int b = 3;
//        System.out.println(a / b);

//        System.out.println(-5 + 8 * 6);
//        System.out.println((55 + 9)% 9);
//        System.out.println(20 + -3 * 5 / 8);
//        System.out.println(5 + 15 / 3 * 2 - 8 % 3);

        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Введите второе число");
        int number2 = scanner.nextInt();
        // System.out.println(number * number2);

        System.out.println(number + number2);
        System.out.println(number - number2);
        System.out.println(number * number2);
        System.out.println(number / number2);
        System.out.println(number % number2);
    }
}
