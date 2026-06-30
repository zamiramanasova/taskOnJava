package Task141122;

import java.util.Scanner;

/**
 * 33
 *  Напишите программу на Java и вычислите сумму цифр целого числа.
 */
public class LessonSix {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        int newNumber = Math.abs(number);
        while(newNumber > 0) {
           int b = newNumber % 10;
              sum += b;
            newNumber /= 10;
        }
        System.out.println(sum);
        // System.out.println(newNumber);
    }
}
