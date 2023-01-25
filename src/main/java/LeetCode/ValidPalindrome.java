package LeetCode;

public class ValidPalindrome {

    public static void main(String[] args) {

        String xyz = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(xyz));
    }

    public static boolean isPalindrome(String s) {

        String str = s.replaceAll("[^A-Za-z0-9]", "");
        String[] str1 = str.split("");
        String str2 = "";

        for (int i = str1.length - 1; i >= 0; i--) {
            str2 += str1[i];
        }

        if (str.equalsIgnoreCase(str2)) {
            return true;
        } else {
            return false;
        }
    }
}
