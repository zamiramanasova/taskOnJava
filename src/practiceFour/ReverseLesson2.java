package practiceFour;

public class ReverseLesson2 {
    public static void main(String[] args) {
        String word = "sapa";
        System.out.println(reverseLesson(word));
    }

    public static StringBuilder reverseLesson(String word) {
        StringBuilder st = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            st.append(word.charAt(i));
        }
        return st;
    }
    // T O(n)
    // S O(n)
}
