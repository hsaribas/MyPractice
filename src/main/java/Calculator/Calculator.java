package Calculator;

import java.util.Scanner;

public class Calculator {

    private double number = 0;

    private boolean flag = true;

    private final Scanner scan = new Scanner(System.in);

    public void calc() {
        System.out.println("* * * CALCULATOR * * *");
        System.out.println();

        while (flag) {
            operation();
        }

        System.out.println();
        System.out.println("* * * See you again! * * *");
    }

    private void operation() {
        System.out.println();
        value();
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
        decision();
    }

    private void value() {
        System.out.println("Current value -> [" + number + "]");
    }

    private void decision() {
        System.out.println();
        System.out.print("If you want to continue press 'C' or press 'Q' to quit: ");
        String dec = scan.next().toUpperCase();

        if (dec.equalsIgnoreCase("C")) {
            operation();
        } else if (dec.equalsIgnoreCase("Q")){
            flag = false;
        } else {
            System.out.println("Enter a valid letter!");
            decision();
        }
    }
}
