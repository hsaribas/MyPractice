package Practice;

import java.util.Scanner;

public class ExponentialNumbers {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome!");
        power();
    }

    static void power() {
        while (true) {
            System.out.println("Please enter a number then its exponent to multiply!");
            int num = scan.nextInt();
            int pow = scan.nextInt();
            int result = 1;

            for (int i = 1; i <= pow; i++) {
                result *= num;
            }
            System.out.println(result);

            System.out.println();

            System.out.println("To continue press 1, or press 2 to quit");
            int dec = scan.nextInt();

            if (dec == 1) {
                power();
            } else if (dec == 2) {
                System.out.println("See you again, bye!");
                break;
            }
        }
    }
}
