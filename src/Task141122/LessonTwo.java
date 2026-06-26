package Task141122;

import java.util.Scanner;

/**
 * Task 7
 * Напишите программу на Java, которая принимает
 * число в качестве входных данных и печатает
 * свою таблицу умножения до 10.
 */

public class LessonTwo {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(a + " * " + i + " = " + a * i);
        }

//        след задачи 10, 11 "вычисления"
        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
        System.out.println(4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));
    }
}
