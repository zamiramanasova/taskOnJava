package practice;

public class PalindromLesson {
    public static void main(String[] args) {
        String s = "okkot ";
        System.out.println(palindrom(s));
    }

    public static boolean palindrom(String a) {
        int left = 0;
        int right = a.length() - 1;
        while (left < right) {
            if (a.charAt(left) != a.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
