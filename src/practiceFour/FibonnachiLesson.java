package practiceFour;

public class FibonnachiLesson {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(fibbonnachi(num));
    }

    public static int fibbonnachi(int num) {

        int a = 0;
        int b = 1;

        for (int i = 2; i < num; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    //T = O(n)
    //s = O(1)
}
