package Task141122;

/**
 * 66. Напишите программу на Java для вычисления
 * суммы первых 100 простых чисел.
 */
public class Lesson66 {
    public static void main(String[] args) {
        int sum = 1;
        int ctr = 0;
        int n = 0; // инициализация переменных

        while (ctr < 100) { // пока переменная меньше ста
            n++; // переменная ++
            if (n % 2 != 0) { // если переменная при делении не равняется остатку 0
                //проверить четное ли число
                if (is_Prime(n)) {
                    sum += n;
                }
            }
            ctr++;
        }
        System.out.println("\nSum of the prime numbers till 100: "+ sum);

    }

    public static boolean is_Prime(int n) {//проверка на четность число
        for (int i = 3; i * i <= n ; i+=2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
