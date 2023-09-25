package Practice;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word to check if it is palindrome or not: ");
        String word = scan.next().toLowerCase();
        StringBuilder newWord = new StringBuilder();

        for (int i = word.length() - 1; i > -1; i--) {
            newWord.append(word.charAt(i));
        }

        if (word.equals(newWord.toString())) {
            System.out.println("It's a Palindrome -> " + word);
        } else {
            System.out.println("It's not a Palindrome -> " + word);
        }
    }
}
