package Practice;

import java.util.Scanner;

public class NearestFibonacci {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if (num == 0) {
            System.out.println(0);
        }

        int first = 0, second = 1;
        int third = first + second;

        while (third < num) {
            first = second;
            second = third;
            third = first + second;
        }

        int dis = num - second;
        int lastFibo = num - dis;
        System.out.println(lastFibo);
    }
}
