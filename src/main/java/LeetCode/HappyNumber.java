package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {
        int num = 19;

        System.out.println(isHappy(num));
    }

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while (n != 1) {
            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            if (set.contains(sum)) {
                return false;
            }

            set.add(sum);
            n = sum;
        }

        return true;
    }
}
