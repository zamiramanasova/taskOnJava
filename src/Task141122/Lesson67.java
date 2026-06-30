package Task141122;

/**
 * 67. Напишите программу на Java для вставки слова в
 * середину другой строки. Перейти к редактору
 * Вставить «Учебник» в середине «Python 3.0»,
 * поэтому результатом будет Python Tutorial 3.
 */
public class Lesson67 {
    public static void main(String[] args) {
        String text = "Python 3.0";
        StringBuffer sb = new StringBuffer(text);
        sb.insert(7, "Tutorial ");
        System.out.println(sb);

        // другой вариант с методом substring
        String main_string ="Python 3.0";
        String word ="Tutorial";
        System.out.println(main_string.substring(0, 7) + word + main_string.substring(6));
    }
}
