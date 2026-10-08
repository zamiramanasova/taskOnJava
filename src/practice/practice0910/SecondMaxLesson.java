package practice.practice0910;

public class SecondMaxLesson {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,4};
        System.out.println(secondMax(nums));
    }

    public static int secondMax(int[] nums) {
        if (nums == null || nums.length < 2)
            return -1;

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
        return max2 == Integer.MIN_VALUE ? -1 : max2;
    }
}
