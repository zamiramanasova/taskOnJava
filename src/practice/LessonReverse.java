package practice;

public class LessonReverse {
    public static void main(String[] args) {
        String word = "Lesson";
        System.out.println(reverse(word));
    }

    public static String reverse(String s) {
        return new StringBuilder(s)
                .reverse()
                .toString();
    }
}
