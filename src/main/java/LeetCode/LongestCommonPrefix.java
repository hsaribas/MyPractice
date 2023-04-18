package LeetCode;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(arr));
    }

    static String longestCommonPrefix(String[] arr) {
        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[arr.length - 1];
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < arr[0].length(); i++) {
            if (first.charAt(i) == last.charAt(i)) {
                newStr.append(first.charAt(i));
            }
        }
        return newStr.toString();
    }
}
