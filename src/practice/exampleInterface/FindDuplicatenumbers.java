package practice.exampleInterface;

import java.util.HashMap;
import java.util.Map;

/**
 * Нужно с помощью HashMap посчитать, сколько раз встречается каждое число.
 */
public class FindDuplicatenumbers {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 4, 1, 5, 2};
        System.out.println(duplicateNumbers(nums));
    }

    public static Map<Integer, Integer> duplicateNumbers(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            //Для каждого num:
            //- если числа ещё нет → getOrDefault(num, 0) возвращает 0;
            //- добавляем 1;
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return map;
        //`Time Complexity` O(n)
        //`Space Complexity`.  O(n)
    }
}
