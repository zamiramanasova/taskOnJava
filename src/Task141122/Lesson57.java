package Task141122;

import java.util.Scanner;

/**
 * 57. Напишите программу на Java, которая принимает
 * целое число и подсчитывает множители числа.
 */
public class Lesson57 {
    public static void main(String[] args) {
        System.out.println("Enter number : ");
        Scanner scanner = new Scanner(System.in);
        int a = 28;//scanner.nextInt();
        System.out.println(result(a));
    }

    public static int result(int num) {
        int ctr = 0;
        for (int i = 1; i <=(int)Math.sqrt(num); i++) {
            if (num%i==0 && i*i!=num){
                ctr +=2;
            } else if (i*i==num) {
                ctr++;
            }
        }
        return ctr;
    }

}
