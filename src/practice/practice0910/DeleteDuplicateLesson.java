package practice.practice0910;

import java.util.LinkedHashSet;
import java.util.Set;

public class DeleteDuplicateLesson {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,5,5,6};
        System.out.println(dupElement(nums));
    }

    public static Set<Integer> dupElement(int[] nums) {
        Set<Integer> unique = new LinkedHashSet<>();

        for (int n : nums) {
            unique.add(n);
        }

        return unique;
    }
}
