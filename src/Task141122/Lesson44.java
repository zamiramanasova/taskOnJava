package Task141122;

import java.util.Scanner;

/**
 * 44. Напишите программу на Java, которая принимает целое
 * число (n) и вычисляет значение n + nn + nnn.
 */
public class Lesson44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);
    }
}
