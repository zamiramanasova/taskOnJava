package practiceFour;

public class SecondMaxElementLesson {
    public static void main(String[] args) {
        int[] nums = {4, 7, 2, 7, 9, 9, 5};
        System.out.println(findSecondMaxElement(nums));

    }

    public static Integer findSecondMaxElement(int[] array) {
        if (array == null || array.length < 2) {
            return null;
        }

        Integer a1 = null;
        Integer a2 = null;

        for (int n : array) {
            if (a1 == null || n > a1) {//если a1 равно 0 или  н больше а1
                a2 = a1;//то в а2 записываем то что есть в а1
                a1 = n;//а в а1 записываем то что есть в н
            } else if ((a2 == null || n > a2) && n != a1) {//(иначе если а2 равно 0 или н больше а2) и н не равно а1
                a2 = n;//то в а2 записываем н
            }
        }
        return a2;
        //Time Complexity` O(n)
        //Space Complexity`.  O(1)
    }
}
