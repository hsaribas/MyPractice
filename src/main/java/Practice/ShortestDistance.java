package Practice;

import java.util.Scanner;

public class ShortestDistance {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int num = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int s = scan.nextInt();
            int d = scan.nextInt();
            double v = (double) s / d;

            if (v > num) {
                num = (int) Math.round(v);
            }
        }
        System.out.println(60 / num);
    }
}
