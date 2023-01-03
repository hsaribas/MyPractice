package Practice;

import java.util.Scanner;

public class CountCommonPrefix {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String S = in.nextLine().toLowerCase();
        String text = in.nextLine();
        String[] arr = text.split(" ");
        int count = 0;

        for (String w : arr) {
            w = w.toLowerCase();
            if (w.contains(S)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
