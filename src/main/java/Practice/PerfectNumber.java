package Practice;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        int num1 = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                num1 += i;
            }
        }

        if (num1 == num) {
            System.out.println("Perfect number!");
        } else if (num == 1) {
            System.out.println("1 is not a Perfect number!");
        } else {
            System.out.println("Not a Perfect number!");
        }
    }
}
