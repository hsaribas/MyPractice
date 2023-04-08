package Practice;

import java.util.Scanner;

public class InvertedTriangle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        int num1 = num - 1;

        for (int i = 1; i <= (2 * num) - 1; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int j = 1; j < num; j++) {
            for (int k = 1; k <= j; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= (2 * num1) - 1; l++) {
                System.out.print("*");
            }
            num1--;
            System.out.println();
        }
    }
}
