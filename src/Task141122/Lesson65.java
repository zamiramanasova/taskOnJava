package Task141122;

import java.util.Scanner;

/**
 * Напишите программу на Java для вычисления модулей
 * двух чисел без использования встроенного оператора модуля.
 */
public class Lesson65 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int a = in.nextInt();
        System.out.print("Input the second number: ");
        int b = in.nextInt();
        int divided = a / b;
        int result = a - (divided * b);
        System.out.println(result);
    }
}
