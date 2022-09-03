package ScrabbleGame;

import java.util.Scanner;

public class scrabblegame {

    static Scanner scan = new Scanner(System.in);
    static String firstPlayer = "";
    static String secondPlayer = "";
    static int firstPlayersScore = 0;
    static int secondPlayersScore = 0;
    static String beginningOrEnd = "";
    static String continueOrFinish = "";
    static char ch;

        public static void main(String[] args) {

            System.out.println("Welcome to our Scrabble Game for two person!");

            firstStep();

        }
        public static void firstStep(){
            //System.out.println("STEP: 1");
            System.out.println("First Player: Enter a word to start the game");
            firstPlayer = scan.next();
            secondStep();
        }
        public static void secondStep(){
            //System.out.println("STEP: 2");
            System.out.println("Second Player: Check if the word is valid or not");
            secondPlayer = scan.next();

            if(secondPlayer.equalsIgnoreCase("Valid")){
                firstPlayersScore += firstPlayer.length();
                currentScore();
                thirdStep();
            }else{
                winnerOfGame();
            }
        }
        public static void thirdStep(){
            //System.out.println("STEP: 3");
            System.out.println("Do you want to continue?");
            continueOrFinish = scan.next();

            if(continueOrFinish.equalsIgnoreCase("Yes")){
                //System.out.println("STEP: 3.1");
                System.out.println("Enter a letter");
                ch = scan.next().charAt(0);
                System.out.println("Which side you want to add letter? Press 'L' for Beginning and 'R' for End");
                beginningOrEnd = scan.next();
                if(beginningOrEnd.equalsIgnoreCase("L")){
                    System.out.println(ch + firstPlayer);
                }else if(beginningOrEnd.equalsIgnoreCase("R")){
                    System.out.println(firstPlayer + ch);
                }else{
                    System.out.println("Enter a valid letter!");
                }
                currentScore();
                firstStep1();
            }else{
                winnerOfGame();
            }
        }
        public static void firstStep1(){
            System.out.println("Second Player: Enter a word to continue the game");
            secondPlayer = scan.next();
            secondStep1();
        }
        public static void secondStep1(){
            System.out.println("First Player: Check if the word is valid or not");
            firstPlayer = scan.next();

            if(firstPlayer.equalsIgnoreCase("Valid")){
                secondPlayersScore += secondPlayer.length();
                currentScore();
                thirdStep1();
            }else{
                winnerOfGame();
            }
        }
        public static void thirdStep1(){
            System.out.println("Do you want to continue?");
            continueOrFinish = scan.next();
            if(secondPlayer.equalsIgnoreCase("Yes")){
                System.out.println("Enter a letter");
                ch = scan.next().charAt(0);
                System.out.println("Which side you want to add letter? Press 'L' for Beginning and 'R' for End\"");
                beginningOrEnd = scan.next();
                if(beginningOrEnd.equalsIgnoreCase("Beginning")){
                    System.out.println(ch + secondPlayer);
                }else if(beginningOrEnd.equalsIgnoreCase("R")){
                    System.out.println(secondPlayer + ch);
                }else{
                    System.out.println("Enter a valid letter!");
                }
                currentScore();
                firstStep11();
            }else{
                winnerOfGame();
            }
        }
        public static void firstStep11(){
            System.out.println("First Player: Enter a word to continue the game");
            firstPlayer = scan.next();
            secondStep();
        }
        public static void winnerOfGame(){
            if(firstPlayersScore>secondPlayersScore){
                System.out.println("The Winner is: First Player !!!");
            }else{
                System.out.println("The Winner is: Second Player !!!");
            }
            System.out.println("The Final Scores... " + "\n" + "First Players Score is: " + firstPlayersScore + "\n" + "Second Players Score is: " + secondPlayersScore);
            System.out.println("Game Over!");
        }
        public static void currentScore(){
            System.out.println("Current points... " + "\n" + "First Players Score is: " + firstPlayersScore + "\n" + "Second Players Score is: " + secondPlayersScore);
        }
}

