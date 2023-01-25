package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {

        int num = 19;
        System.out.println(isHappy(num));
    }

    public static boolean isHappy(int n) {

        Set<Integer> seen = new HashSet<>();
        int current = n;

        while (current != 1) {
            int sum = 0;
            while (current > 0) {
                int digit = current % 10;
                sum += digit * digit;
                current /= 10;
            }
            if (seen.contains(sum)) {
                return false;
            }
            seen.add(sum);
            current = sum;
        }
        return true;
    }
}
