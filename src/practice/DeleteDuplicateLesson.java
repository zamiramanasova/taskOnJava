package practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class DeleteDuplicateLesson {
    public static void main(String[] args) {
        int[] n = {1,2,3,3,4,4,5};
        System.out.println(deleteDup(n));
    }

    public static Set<Integer> deleteDup(int[] nums) {
        Set<Integer> n = new LinkedHashSet<>();
        for (int num : nums) {
            n.add(num);
        }
        return n;
    }
}
