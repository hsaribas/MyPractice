package Calculator;

import java.util.Scanner;

public class Calculator {

    private double number = 0;

    private boolean flag = true;

    private final Scanner scan = new Scanner(System.in);

    public void calc() {
        System.out.println("* * * CALCULATOR * * *");
        System.out.println();

        value();

        while (flag) {
            operation();
        }
        System.out.println();
        System.out.println("* * * See you again! * * *");
    }

    private void operation() {
        System.out.println();
        System.out.print("Select an operation -> [ +, -, *, / ] : ");
        String str = scan.next().toUpperCase();

        System.out.print("Enter a number: ");
        double n = scan.nextDouble();

        switch (str) {
            case "+":
                number += n;
                break;
            case "-":
                number -= n;
                break;
            case "*":
                number *= n;
                break;
            case "/":
                number /= n;
                break;
            default:
                System.out.println("Enter a valid operation!");
                break;
        }
        System.out.println();
        value();

        System.out.println();
        System.out.print("If you want to continue press 'Y' or press 'Q' to quit: ");
        str = scan.next().toUpperCase();

        if (str.equalsIgnoreCase("Y")) {
            operation();
        } else if (str.equalsIgnoreCase("Q")){
            flag = false;
        }
    }

    private void value() {
        System.out.println("Current value -> " + number);
    }
}
