package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static void main(String[] args) {
        int num = 4;
        System.out.println(generateParenthesis(num));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private static void backtrack(List<String> result, String curr, int open, int close, int max) {
        if (curr.length() == max * 2) {
            result.add(curr);
            return;
        }

        if (open < max) {
            backtrack(result, curr + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(result, curr + ")", open, close + 1, max);
        }
    }
}
