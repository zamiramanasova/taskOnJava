package practiceFour;

public class PalindromLesson {
    public static void main(String[] args) {

        String word = "lever";
        System.out.println(palindromLesson(word));
    }

    public static boolean palindromLesson(String word) {
        StringBuilder stBuilder = new StringBuilder(word);

        int l = 0;
        int r = stBuilder.length() - 1;
        while (l < r){
            if (stBuilder.charAt(l) != stBuilder.charAt(r) ) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    // T O(n)
    // S O(n)
}
