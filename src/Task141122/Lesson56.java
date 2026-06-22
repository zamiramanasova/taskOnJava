package Task141122;

/**
 * 56. Напишите программу на Java, чтобы найти число целых
 * чисел в диапазоне двух указанных чисел, которые делятся
 * на другое число. Перейти к редактору
 * Например, x = 5, y = 20 и p = 3, найдите количество
 * целых чисел в диапазоне x..y, которые делятся на p
 */
public class Lesson56 {
    public static void main(String[] args) {
        int a = 5;
        int b = 20;
        int p = 3;
        System.out.println(result(a,b,p));
    }
    public static int result(int a, int b, int p) {
        if (a%p == 0)
            return (b/p - a/p + 1);
        return (b/p - a/p);
    }
}
