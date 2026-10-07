package practice.practice2;

public class PalindromLesson {
    public static void main(String[] args) {
        String s = "levey";
        System.out.println(palindrom(s));
    }

    public static boolean palindrom(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {//означает: сравниваем символы, пока указатели не встретились.
            //мы просто один раз дополнительно сравним центральный символ с самим собой.
            //Результат от этого не изменится, но это лишняя проверка.
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
