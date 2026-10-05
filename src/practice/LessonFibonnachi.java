package practice;


/**
 Числа Фибоначчи — последовательность, где каждое число равно сумме двух предыдущих:
 */
public class LessonFibonnachi {
    public static void main(String[] args) {

    }

    public static int fibonnachi(int n) {
        if (n <= 1) return n; //Это базовый случай, потому что цикл начинается с i = 2.
        int a = 0, b = 1; //держим два последних числа — a и b
        for (int i = 2; i <= n; i++) { //В Фибоначчи цикл начинается с i = 2, потому что F(0) и F(1) мы уже знаем — их не надо вычислять.
            int c = a + b; //На каждой итерации считаем c = a + b
            a = b; // потом сдвигаем: a = b, b = c
            b = c;
        }
        return b;// Ключевая мысль: в конце каждой итерации b становится равным c — то
        // есть последнему посчитанному числу. Значит, после последней итерации b = F(n).

        //Работает за O(n) по времени и O(1) по памяти.
    }

    public static int fib(int x) {
        if (x <= 1) return x;
        int a = 0, b = 1;
        for (int i = 2; i <= x; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
