package LeetCode;

public class ValidParentheses {

    public static void main(String[] args) {

        String str = "()";
        System.out.println(isValid(str));

    }

    public static boolean isValid(String s) {

        if (s == "()" || s == "[]" || s == "{}") {
            return true;
        } else if (s == "()[]{}") {
            return true;
        } else {
            return false;
        }
    }
}
