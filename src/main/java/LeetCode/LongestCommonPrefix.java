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
        String newStr = "";

        for (int i = 0; i < arr[0].length(); i++) {
            if (first.charAt(i) == last.charAt(i)) {
                newStr += first.charAt(i);
            } else {
                break;
            }
        }
        return newStr;
    }
}
