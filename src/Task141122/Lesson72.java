package Task141122;

/**
 * 72. Напишите программу на Java для создания новой строки,
 * в которой первые три символа взяты из данной строки.
 * Если длина данной строки меньше 3,
 * используйте «#» в качестве заменяющих символов.
 */
public class Lesson72 {
    public static void main(String[] args) {
        String str1 = "Hello";
        int len = str1.length();
        if(len >= 3)
            System.out.println( str1.substring(0, 3));
        else if(len == 1)
            System.out.println( (str1.charAt(0)+"##"));
        else
            System.out.println("###");
    }
}
