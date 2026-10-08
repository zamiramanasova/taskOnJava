package practice.practice0910;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueLesson {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,4};
        System.out.println(firstUnique(nums));
    }

    public static int firstUnique(int[] nums) {
        Map<Integer, Integer> q = new LinkedHashMap<>();

        for (int n : nums) {
            q.put(n, q.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : q.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }
}
