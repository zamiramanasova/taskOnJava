package Task141122;

/**
 * 69. Напишите программу на Java для
 * извлечения первой половины строки четной длины.
 */
public class Lesson69 {
    public static void main(String[] args) {
        String word = "Python";
        System.out.println(word.substring(0, word.length()/2));
    }
}
