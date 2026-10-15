package practiceFour;


import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DeleteDuplicateLesson {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 2, 5, 3, 2, 8, 3, 1);
        System.out.println(uniqueNums(numbers));
    }

    public static Set<Integer> uniqueNums(List<Integer> nums) {
        Set<Integer> arr = new LinkedHashSet<>();

        for (int n : nums) {
            arr.add(n);
        }

        return arr;
    }
    // T = O(n)
    // S = O(n)
}
