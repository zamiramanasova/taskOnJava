package practice.practice2;

public class BinarySearchLesson {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9, 11, 15, 20};
        int target = 7;
        System.out.println(binarySearch(nums,target));
    }

    public static int binarySearch(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
        //Time Complexity	O(log n)
        //Space Complexity	O(1)
    }
}
