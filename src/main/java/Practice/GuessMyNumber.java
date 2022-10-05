package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GuessMyNumber {

    static Scanner scan = new Scanner(System.in);
    static int num = (int)(Math.random()*100);
    static int right = 5;
    static int pick;
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {

        pickNumber();

    }

    static void pickNumber(){

        while(right > 0){
                System.out.println("Pick a number between 0 & 100");
                pick = scan.nextInt();
                list.add(pick);

                if(pick==num){
                    System.out.println("You found the number!" + "\n" + "Congratulations... You won the game!");
                    right = 0;
                }else{
                    System.out.println("Try again!");
                    System.out.println();
                    right--;
                    if(right==0){
                        System.out.println("Game Over!" + "\n" + "Your predictions: " + list);
                        break;
                    }
                    pickNumber();
                }
        }
    }
}
