package practice.practice2;

public class SecondMax {
    public static void main(String[] args) {
        int[] nums = {10, 5, 8, 20, 20, 15};
        System.out.println(secondMax(nums));
    }

    public static Integer secondMax(int[] nums) {
        if (nums == null || nums.length < 2) {
            return -1;
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int n : nums) {
            if (n > max1) {
                max2 = max1;
                max1 = n;
            } else if (n > max2 && n != max1) {
                max2 = n;
            }
        }

        return max2 == Integer.MIN_VALUE ? - 1 : max2;

        //Time Complexity = O(n)
        //Space Complexity = O(n)
    }
}
