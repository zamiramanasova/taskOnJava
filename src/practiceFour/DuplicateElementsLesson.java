package practiceFour;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateElementsLesson {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 1, 1, 4};
        System.out.println(dupElements(numbers));
    }

    public static Map<Integer, Integer> dupElements(int[] nums) {
        Map<Integer, Integer> arr = new LinkedHashMap<>();

        for (int n : nums) {
            arr.put(n, arr.getOrDefault(n, 0) + 1);
        }

        return arr;
    }
    // T = O(n)
    // S = O(n)
}
