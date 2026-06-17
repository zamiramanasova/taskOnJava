package Task141122;

import java.nio.charset.Charset;

/**
 * 40
 * Напишите Java-программу для перечисления доступных
 * наборов символов в объектах charset.
 */
public class Lesson40 {
    public static void main(String[] args) {
        System.out.println(Charset.class);
        for (String str: Charset.availableCharsets().keySet()) {
            System.out.println(str);
        }
    }
}
/**
 * Charset.class
 * Этот класс также определяет статические методы для того,
 * чтобы протестировать, поддерживается ли определенный
 * набор символов, который доступен в текущей виртуальной машине Java
 */