package practice.practice0910;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElementsLesson {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,4};
        System.out.println(dup(nums));

    }

    public static Map<Integer, Integer> dup(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        return map;
    }
}
