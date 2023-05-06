package LeetCode;

public class ValidPalindrome {

    public static void main(String[] args) {
        String xyz = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(xyz));
    }

    public static boolean isPalindrome(String s) {
        String str = s.replaceAll("[^A-Za-z0-9]", "");
        String[] str1 = str.split("");
        StringBuilder str2 = new StringBuilder();

        for (int i = str1.length - 1; i >= 0; i--) {
            str2.append(str1[i]);
        }

        return str.equalsIgnoreCase(str2.toString());
    }
}
