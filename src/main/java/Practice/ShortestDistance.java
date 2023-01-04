package Practice;

import java.util.Scanner;

public class ShortestDistance {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int num = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int S = scan.nextInt();
            int D = scan.nextInt();
            double V = (double) S / D;
            if (V > num) {
                num = (int) Math.round(V);
            }
        }
        System.out.println(60 / num);
    }
}
