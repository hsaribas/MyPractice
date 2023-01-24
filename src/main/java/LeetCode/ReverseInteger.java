package LeetCode;

public class ReverseInteger {

    public static void main(String[] args) {

        int num = -3450;
        System.out.println(reverse(num));

    }

    public static int reverse(int x) {

        String str = Integer.toString(x);
        String s = "";

        if (x < 0) {
            s = "-";
            str = str.substring(1);
            if (x % 10 == 0) {
                str = str.substring(0, str.indexOf("0"));
            }
        } else if (x % 10 == 0) {
            str = str.substring(0, str.indexOf("0"));
        }

        return Integer.parseInt(s + new StringBuilder(str).reverse());
    }
}
