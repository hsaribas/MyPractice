package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSortedArray {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int x = 0;
        int[] arr2 = {2, 5, 6};
        int y = 0;
        merge(arr1, x, arr2, y);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        List<Integer> list = new ArrayList<>();

        for (int w : nums1) {
            if (w > 0) {
                m++;
                list.add(w);
            }
        }
        for (int z : nums2) {
            if (z > 0) {
                n++;
                list.add(z);
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
