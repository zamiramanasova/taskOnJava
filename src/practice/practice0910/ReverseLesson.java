package practice.practice0910;

public class ReverseLesson {
    public static void main(String[] args) {
        String s = "java";
        System.out.println(reverse(s));
    }

    public static StringBuilder reverse(String s) {
        StringBuilder word = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            word.append(s.charAt(i));
        }
        return word;
    }
}
