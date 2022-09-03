package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GuessMyNumber {

    static Scanner scan = new Scanner(System.in);
    static int num = (int)(Math.random()*100);
    static int right = 5;
    static int pick;
    static int score = 0;
    static List<Integer> list = new ArrayList<>();
    static int select = 0;

    public static void main(String[] args) {

        pickNumber();

    }

    static void pickNumber(){

        while(right > 0){
            System.out.println("Pick a number between 0 & 100");
            pick = scan.nextInt();

            for(int i=0; i<=select; i++){
                i = pick;
                list.add(i);
            }
            select++;

            if(pick==num){
                System.out.println("Well done, you found the number!");
                System.out.println("====================");
                score+=100;
                if(score==100){
                    System.out.println("Congratulations... You won the game!");
                    break;
                }
                pickNumber();

            }else{
                System.out.println("Try again!");
                System.out.println("====================");
                right--;
                if(right==0){
                    System.out.println("Your predictions: " + list);
                    System.out.println("Game Over!");
                    break;
                }
                pickNumber();

            }
        }
    }
}
