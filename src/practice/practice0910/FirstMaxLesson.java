package practice.practice0910;

public class FirstMaxLesson {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(maxElement(nums));
    }

    public static int maxElement(int[] nums) {
        int max = nums[0];

        for (int i = 1; i <= nums.length - 1; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    //T = O(n)
    //s = O(1)
}
