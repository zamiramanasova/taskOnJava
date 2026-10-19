package practiceFour;

public class FindSecondUniqueElement {

    public static void main(String[] args) {

        int[] nums = {4, 7, 2, 7, 9, 9, 5};
        System.out.println(findSecondUniqueElement(nums));
    }

    public static Integer findSecondUniqueElement(int[] nums) {
        if(nums == null || nums.length < 2) {
            return null;
        }
        int firstNumber = Integer.MIN_VALUE;
        int secondNumber = Integer.MIN_VALUE;

        for (int n : nums) {
            if (n > firstNumber) {
                secondNumber = firstNumber;
                firstNumber = n;
            } else if (n > secondNumber && n != firstNumber) {
                secondNumber = n;
            }
        }
        return secondNumber == Integer.MIN_VALUE ? -1 : secondNumber;
        //`Time Complexity` O(n)
        //`Space Complexity`.  O(1)
    }
}
