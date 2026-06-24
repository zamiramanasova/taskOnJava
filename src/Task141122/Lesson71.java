package Task141122;

/**
 * 71. Напишите программу на Java для создания объединения
 * двух строк, за исключением удаления первого символа
 * каждой строки. Длина строк должна быть от 1 и выше.
 */
public class Lesson71 {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Friend";

        System.out.println(a.substring(1) + b.substring(1));
    }
}
