package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public static void main(String[] args) {

        String str = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(str));

    }

    public static int lengthOfLongestSubstring(String s) {

        int a = 0, b = 0, max = 0;
        Set<Character> set = new HashSet<>();

        while (a < s.length()) {
            if (!set.contains(s.charAt(a))) {
                set.add(s.charAt(a));
                a++;
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(b));
                b++;
            }
        }
        return max;
    }
}
