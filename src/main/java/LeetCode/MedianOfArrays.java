package LeetCode;

import java.util.Arrays;

public class MedianOfArrays {

    public static void main(String[] args) {
        int[] x = {1, 2};
        int[] y = {3, 4};

        System.out.println(findMedianSortedArrays(x, y));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = 0;
        int[] nums3 = new int[nums1.length + nums2.length];

        for (int x : nums1) {
            nums3[a] = x;
            a++;
        }

        for (int y : nums2) {
            nums3[a] = y;
            a++;
        }

        Arrays.sort(nums3);
        int b = nums3.length;

        if (b % 2 != 0) {
            return Math.floor(nums3[b / 2]);
        } else {
            return (double) ((nums3[b / 2 - 1]) + (nums3[b / 2])) / 2;
        }
    }
}
