package practiceFour;

public class FactorialLesson {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(palindromLesson(num));
    }

    public static int palindromLesson(int num) {
        int a = 1;

        for (int i = 2; i <= num; i++) {
            a = a * i;
        }
        return a;
    }
    //T O(n)
    //S O(1)
}
