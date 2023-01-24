package LeetCode;

public class MultiplyStrings {

    public static void main(String[] args) {

        String a = "7", b = "5";
        System.out.println(multiply(a, b));

    }

    public static String multiply(String num1, String num2) {

        int num = Integer.parseInt(num1) * Integer.parseInt(num2);
        return String.valueOf(num);
    }
}
