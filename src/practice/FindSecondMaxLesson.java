package practice;

/**
 * Как это работает
 * max1 — самый большой элемент, который мы встретили.
 *
 * max2 — второй по величине (но меньше max1).
 *
 * Проходим по массиву:
 *
 * Если число больше max1 — сдвигаем: старый max1 становится max2, а новое число — max1.
 *
 * Иначе, если число больше max2 и не равно max1 — обновляем max2.
 *
 * В конце, если max2 остался Integer.MIN_VALUE, значит второго максимума нет — возвращаем -1.
 */
public class FindSecondMaxLesson {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(secondMax(nums));
    }

    public static int secondMax(int[] nums) {
        if (nums == null || nums.length < 2) {
            return -1;
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int n : nums) {
            if (n > max1) {
                max2 = max1; //присвоение
                max1 = n;
            } else if (n > max2 && n != max1) {
                max2 = n;
            }
        }
        return max2 == Integer.MIN_VALUE ? -1 : max2; //Если max2 равен Integer.MIN_VALUE — верни -1, иначе верни max2
    }
}
