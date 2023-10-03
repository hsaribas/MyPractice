package LeetCode;

public class Sqrt {

    public static void main(String[] args) {
        int a = 49;

        System.out.println(mySqrt(a));
    }

    public static int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        return (int) Math.sqrt(x);
    }
}
