package LeetCode;

import java.util.Objects;

public class ValidParentheses {

    public static void main(String[] args) {
        String str = "()";

        System.out.println(isValid(str));
    }

    public static boolean isValid(String s) {
        if (Objects.equals(s, "()") || Objects.equals(s, "[]") || Objects.equals(s, "{}")) {
            return true;
        } else return Objects.equals(s, "()[]{}");
    }
}
