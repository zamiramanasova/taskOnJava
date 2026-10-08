package practice.practice0910;

public class BinarySearchLesson {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int target = 3;
        System.out.println(binary(nums, target));
    }

    public static int binary(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            }
            r = mid - 1;
        }
        return -1;
    }
}
