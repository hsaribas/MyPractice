package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class SortELinArr {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to add to your list? ");
        int num = scan.nextInt();
        int[] arr = new int[num];

        System.out.println("Enter the numbers of your list...");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
