package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {

    public static void main(String[] args) {

        int[] numbers = {0, 1, 2, 2, 3, 0, 4, 2};
        int num = 2;
        System.out.println(removeElement(numbers, num));
    }

    public static int removeElement(int[] nums, int val) {

        List<Integer> list = new ArrayList<>();
        for (int w : nums) {
            if (w != val) {
                list.add(w);
            }
        }
        return list.size();
    }
}
