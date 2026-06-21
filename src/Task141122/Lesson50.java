package Task141122;

/**
 * 50. Напишите программу на Java для печати чисел от 1 до 100,
 * которые делятся на 3, 5 и оба.
 */
public class Lesson50 {
    public static void main(String[] args) {
        System.out.println("Divided by 3 : ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }

        System.out.println("\nDivided by 5 : ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }

        System.out.println("\nDivided by 3 and by 5 : ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
