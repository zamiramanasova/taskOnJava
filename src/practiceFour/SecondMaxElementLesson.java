package practiceFour;

public class SecondMaxElementLesson {
    public static void main(String[] args) {

    }

    public static Integer findSecondMaxElement(int[] array) {
        if (array == null || array.length < 2) {
            return null;
        }

        int a1 = Integer.MIN_VALUE;
        int a2 = Integer.MIN_VALUE;

        for (int n : array) {
            if (n > a1) {//если н больше а2
                a2 = a1;//то в а2 записываем то что есть в а1
                a1 = n;//а в а1 записываем то что есть в н
            } else if (n > a2 && n != a1) {//иначе если н больше а2 и н не равно а1
                a2 = n;//то в а2 записываем н
            }
        }
        return a2 == Integer.MIN_VALUE ? null : a2; //тернарный оператор,Если a2 равен Integer.MIN_VALUE, то верни null, иначе верни a2
    }
}
