package LeetCode;

import java.util.Arrays;

public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int tar = 5;
        System.out.println(searchInsert(arr, tar));
    }

    public static int searchInsert(int[] nums, int target) {
        int idx = Arrays.binarySearch(nums, target);

        return idx < 0 ? -(idx + 1) : idx;
    }
}
