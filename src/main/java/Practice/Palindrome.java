package Practice;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word to check if it is palindrome or not");
        String word = scan.next().toLowerCase();
        String newWord = "";

        for(int i=word.length()-1; i>-1; i--){
            newWord += word.charAt(i);
        }

        if(word.equals(newWord)){
            System.out.println("It's a Palindrome -> " + word);
        }else{
            System.out.println("Hello");
            System.out.println("It's NOT a Palindrome -> " + word);
        }

        System.out.println("Huzeyfe");

    }

}
