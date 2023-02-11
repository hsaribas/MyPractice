package LeetCode;

public class LastWordsLength {

    public static void main(String[] args) {

        String word = "Hello World";
        System.out.println(lengthOfLastWord(word));
    }

    public static int lengthOfLastWord(String s) {

        String[] arr = s.trim().split(" ");
        String str = arr[arr.length - 1];

        return str.length();
    }
}
