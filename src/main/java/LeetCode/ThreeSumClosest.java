package LeetCode;

import java.util.Arrays;

public class ThreeSumClosest {

    public static void main(String[] args) {
        int[] arr = {-1, 2, 1, -4};

        System.out.println(threeSumClosest(arr, 1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1, end = nums.length - 1;

            while (start < end) {
                int currSum = nums[i] + nums[start] + nums[end];

                if (Math.abs(currSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currSum;
                }

                if (currSum > target) {
                    end--;
                } else {
                    start++;
                }
            }
        }

        return closestSum;
    }
}
