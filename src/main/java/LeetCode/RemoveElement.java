package LeetCode;

public class RemoveElement {

    public static void main(String[] args) {

        int[] numbers = {0, 1, 2, 2, 3, 0, 4, 2};
        int num = 2;
        System.out.println(removeElement(numbers, num));
    }

    public static int removeElement(int[] nums, int val) {

        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
