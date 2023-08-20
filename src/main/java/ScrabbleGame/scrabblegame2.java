package ScrabbleGame;

import java.util.Scanner;

public class scrabblegame2 {

    static Scanner scan = new Scanner(System.in);
    static String currentPlayer;
    static int playersNum;
    static String enterWord;
    static String validOrNot;
    static int firstPlayersScore = 0;
    static int secondPlayersScore = 0;
    static String beginningOrEnd;
    static String continueOrFinish;
    static int roundNumber = 1;
    static String restartTheGame;
    static char ch;

    public static void main(String[] args) {
        gameBegins();
    }

    public static void gameBegins() {
        System.out.println("Welcome to our Scrabble Game for two person!" + "\n" + "Round " + roundNumber + " is Starting!");
        System.out.println();
        System.out.println("Pick your player number ==> Press 1 or 2 ");
        playersNum = scan.nextInt();

        pickingPlayerNumber();

        System.out.println("You are the " + currentPlayer + ". Enter a word to start the game");
        enterWord = scan.next();

        System.out.println("The opponent ==> Check if the word is valid or not. Press 'Y' for valid and 'N' for not valid");
        validOrNot = scan.next();

        continueToGameOrFinish();
    }

    public static void gameContinues() {
        System.out.println("Do you want to continue? Press 'Y' for YES or press 'N' for NO");
        continueOrFinish = scan.next();

        addingLetterToEachSidePlayerWants();

        throughTheNextStep();
    }

    public static void throughTheNextStep() {
        System.out.println("Enter your player number");
        playersNum = scan.nextInt();

        pickingPlayerNumber();

        System.out.println(currentPlayer + ": Enter a word to continue the game");
        enterWord = scan.next();

        gameBegins();
    }

    public static void winnerOfGame() {
        if (firstPlayersScore > secondPlayersScore) {
            System.out.println("The Winner is: First Player !!!");
        } else if (firstPlayersScore < secondPlayersScore) {
            System.out.println("The Winner is: Second Player !!!");
        } else {
            System.out.println("Nobody won. Game ended in a draw !!!");
        }

        System.out.println("The Final Scores... " + "\n" + "First Players Score is: " + firstPlayersScore + "\n" + "Second Players Score is: " + secondPlayersScore);
        System.out.println();
        System.out.println("Game Over!");
        System.out.println();
        System.out.println("If you want to start to new game press to S");
        restartTheGame = scan.next();
        if (restartTheGame.equalsIgnoreCase("S")) {
            gameBegins();
        }
    }

    public static void currentScore() {
        System.out.println("Current points... " + "\n" + "First Players Score is: " + firstPlayersScore + "\n" + "Second Players Score is: " + secondPlayersScore);
    }

    public static void continueToGameOrFinish() {
        if (validOrNot.equalsIgnoreCase("Y")) {
            if (playersNum == 1) {
                firstPlayersScore += enterWord.length();
            } else if (playersNum == 2) {
                secondPlayersScore += enterWord.length();
            }

            currentScore();
            gameContinues();

        } else if (validOrNot.equalsIgnoreCase("N")) {
            winnerOfGame();
        } else {
            System.out.println("Enter a valid letter to continue or end the game!");
        }
    }

    public static void pickingPlayerNumber() {
        switch (playersNum) {
            case 1:
                currentPlayer = "First Player";
                break;
            case 2:
                currentPlayer = "Second Player";
                break;
            default:
                System.out.println("Enter a valid number!");
        }
    }

    public static void addingLetterToEachSidePlayerWants() {
        if (continueOrFinish.equalsIgnoreCase("Y")) {
            System.out.println("Enter a letter");
            ch = scan.next().charAt(0);

            System.out.println("Which side you want to add letter? Press 'L' for Beginning and 'R' for End");
            beginningOrEnd = scan.next();

            if (beginningOrEnd.equalsIgnoreCase("L")) {
                System.out.println(ch + enterWord);
            } else if (beginningOrEnd.equalsIgnoreCase("R")) {
                System.out.println(enterWord + ch);
            } else {
                System.out.println("Enter a valid letter!");
            }

            currentScore();
            roundNumber++;

            System.out.println("Let's go to round " + roundNumber);
            System.out.println("Now it is the opponent's turn");

            throughTheNextStep();

        } else if (continueOrFinish.equalsIgnoreCase("N")) {
            winnerOfGame();
        } else {
            System.out.println("Enter a valid letter!");
        }
    }
}
