package practiceFour;

public class ReverseLesson {
    public static void main(String[] args) {

        String word = "word";
        System.out.println(reverse(word));
    }

    public static StringBuilder reverse(String word) {

        StringBuilder rev = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            rev.append(word.charAt(i));
        }
        return rev;
    }
}
