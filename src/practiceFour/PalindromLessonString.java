package practiceFour;

public class PalindromLessonString {
    public static void main(String[] args) {
        String word = "carac";
        System.out.println(palindromString(word));

    }

    public static boolean palindromString(String word) {
        StringBuilder st = new StringBuilder(word);

        int a = 0;
        int b = st.length() -1;
        while (a < b) {
            if (st.charAt(a) != st.charAt(b)) {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
    //T O(n)
    //S O(n)
}
