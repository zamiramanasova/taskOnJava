package practice;

/**
 * И запомни: 0! = 1, 13! переполняет int, при больших n рекурсия упадёт с StackOverflowError.
 */
public class FactorialLesson {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(factorialCycle(number));

    }

    public static int factorial(int a) {
        if (a <= 1) {
            return 1;
        }
        return a * factorial(a - 1);
    }

    /**
     * Начинаем с i = 2, потому что умножать на 1 бессмысленно (result * 1 = result).
     *
     * result = 1 — это стартовое значение, как и в рекурсии. Нейтральный элемент для умножения.
     *
     * Если n = 0 или n = 1, цикл не выполнится ни разу, и result останется 1. Это правильно: 0! = 1, 1! = 1.
     * @param num
     * @return
     */

    public static int factorialCycle(int num) {
        int result = 1; //если равен 1, то возвращаем 1
        for (int i = 2; i <= num; i++) { //так как уже написали единицу то идем вверх и пишем 2ку
            result = result * i;
        }
        return result;
        //можно писать в целом единицу, но будет на 1 итерацию больше
        // память О() ?
        // память О(n)
    }
}
