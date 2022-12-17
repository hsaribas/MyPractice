package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesInArray {

    public static void main(String[] args) {

        int[] numbers = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(numbers));

    }

    public static int removeDuplicates(int[] nums) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!list.contains(nums[i])) {
                list.add(nums[i]);
            }
        }
        return list.size();
    }
}


