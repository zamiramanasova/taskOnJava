package practice.practice0910;

public class FactorialLesson {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factor(n));
    }

    public static int factor(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    //T = O(n)
    //s = O(1)
}
