package practiceFour;

public class MaxElementLesson {
    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,-4,-5};
        System.out.println(maxElement(nums));
    }

    public static int maxElement(int[] nums) {
        int a = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            if (a < nums[i]) {
                a = nums[i];
            }
        }
        return a;
    }
    //T O(n)
    //S O(1)
}
