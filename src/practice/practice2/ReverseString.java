package practice.practice2;

public class ReverseString {
    public static void main(String[] args) {
        String s = "car";
        System.out.println(reverse(s));
    }

    public static StringBuilder reverse(String s) {
        StringBuilder sbNew = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sbNew.append(s.charAt(i));
        }
        return sbNew;
    }

    //Time Complexity	O(n)
    //Space Complexity	O(n)
}
