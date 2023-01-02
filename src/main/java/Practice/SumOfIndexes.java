package Practice;

import java.util.Scanner;

public class SumOfIndexes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String c = scan.nextLine();
        String s = scan.nextLine();
        String[] arr = s.split("");
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(c)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
