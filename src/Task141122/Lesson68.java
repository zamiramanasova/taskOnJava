package Task141122;

/**
 * 68. Напишите программу на Java для создания новой строки из 4
 * копий последних 3 символов исходной строки.
 * Длина исходной строки должна быть от 3 и выше.
 */
public class Lesson68 {
    public static void main(String[] args) {
        String sbr = "3.0";
        StringBuffer buffer = new StringBuffer(sbr);
        buffer.insert(3, sbr);

        for (int i = 0; i < 2; i++) {
            buffer.insert(3, sbr);
        }

        System.out.println(buffer);
        StringBuilder b = new StringBuilder(buffer);
        System.out.println(b);
    }
}
