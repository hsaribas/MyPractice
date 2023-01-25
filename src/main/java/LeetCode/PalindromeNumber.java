package LeetCode;

public class PalindromeNumber {

    public static void main(String[] args) {

        int x = 121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {

        String str = String.valueOf(x);
        String newStr = "";

        for (int i = str.length() - 1; i > -1; i--) {
            newStr += str.charAt(i);
        }

        if (str.equals(newStr)) {
            return true;
        } else {
            return false;
        }
    }
}
