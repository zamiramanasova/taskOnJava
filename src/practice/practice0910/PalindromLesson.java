package practice.practice0910;

public class PalindromLesson {
    public static void main(String[] args) {
        String s = "okko";
        System.out.println(palindrom(s));
    }
    public static boolean palindrom(String s) {
        int a = 0;
        int b = s.length() - 1;
        while (a < b) {
            if (s.charAt(a) != s.charAt(b)) {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
    //O(n) / O(1).
}
