package practice.practice2;

import java.util.*;

public class DeleteDuplicate {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 3);
        System.out.println(deleteDuplicate(numbers));
    }

    public static List<Integer> deleteDuplicate(List<Integer> nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        return new ArrayList<>(set);
    }
    //Time Complexity: O(n) — проходим по всем элементам списка.
    //Space Complexity: O(n) — в худшем случае все n элементов уникальны и попадут в HashSet.
}
