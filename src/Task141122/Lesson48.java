package Task141122;

/**
 * 48. Напишите программу на Java для
 * печати нечетных чисел от 1 до 99.
 * Печатает по одному числу в строке.
 */
public class Lesson48 {
    public static void main(String[] args) {
//        for (int i = 0; i <= 99; i++) {
//            i++;
//            System.out.println(i);
//        }
//
        //different answer более понятный
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
