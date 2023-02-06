package LeetCode;

public class PowerOfTwo {

    public static void main(String[] args) {

        int num = 16;
        System.out.println(isPowerOfTwo(num));
    }

    public static boolean isPowerOfTwo(int n) {

        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
