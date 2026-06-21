package Task141122;

import java.util.Scanner;

/**
 * 52. Напишите программу на Java для вычисления суммы двух целых чисел и
 * верните true, если сумма равна третьему целому числу.
 */
public class Lesson52 {
    public static void main(String[] args) {
        System.out.println("Enter number : ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Enter number :");
        int b = scanner.nextInt();
        System.out.println("Enter number :");
        int c = scanner.nextInt();
        if (a + b == c) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
// другой вариант
//public static void main(String[] args)
//{
//    Scanner in = new Scanner(System.in);
//    System.out.print("Input the first number : ");
//    int x = in.nextInt();
//    System.out.print("Input the second number: ");
//    int y = in.nextInt();
//    System.out.print("Input the third number : ");
//    int z = in.nextInt();
//    System.out.print("The result is: "+sumOfTwo(x, y, z));
//    System.out.print("\n");
//}
//
//    public static boolean sumOfTwo(int p, int q, int r)
//    {
//        return ((p + q) == r || (q + r) == p || (r + p) == q);
//    }
