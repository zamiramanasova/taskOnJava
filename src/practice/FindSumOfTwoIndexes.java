package practice;

import java.util.HashMap;
import java.util.Map;

public class FindSumOfTwoIndexes {
    public static void main(String[] args) {
        int[] nums = {1,2,8,4,5};
        int target = 3;
        System.out.println(sumOfTwoIndexes(nums, target));
    }

    public static int sumOfTwoIndexes(int[] sums, int target) {
        Map<Integer, Integer> sum = new HashMap<>();

        for (int num : sums) {
            sum.put(num, sum.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : sum.entrySet()) {
            if (entry.getKey() + entry.getKey() == target)
                return entry.getKey();
        }
        return -1;
    }
}
