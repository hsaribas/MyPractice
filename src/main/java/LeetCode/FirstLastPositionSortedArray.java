package LeetCode;

import java.util.Arrays;

public class FirstLastPositionSortedArray {

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int tar = 8;
        System.out.println(Arrays.toString(searchRange(arr, tar)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        if (nums == null || nums.length == 0) return result;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                result[0] = findStartingPosition(nums, target, left, mid);
                result[1] = findEndingPosition(nums, target, mid, right);
                break;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    private static int findStartingPosition(int[] nums, int target, int left, int right) {
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private static int findEndingPosition(int[] nums, int target, int left, int right) {
        while (left < right) {
            int mid = left + (right - left + 1) / 2;

            if (nums[mid] == target) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
