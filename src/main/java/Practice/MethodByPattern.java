package Practice;

import java.util.Scanner;

public class MethodByPattern {

    static void pattern(int a){
        if(a>0){
            System.out.print(a + " ");
            pattern(a-5);
        }
        System.out.print(a + " ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();

        pattern(n);
    }

}
