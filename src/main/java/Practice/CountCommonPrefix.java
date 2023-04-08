package Practice;

import java.util.Scanner;

public class CountCommonPrefix {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().toLowerCase();
        String text = scan.nextLine().toLowerCase();
        String[] arr = text.split(" ");
        int count = 0;

        for (String w : arr) {
            if (w.contains(s)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
