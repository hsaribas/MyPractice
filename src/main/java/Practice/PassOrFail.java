package Practice;

import java.util.Objects;
import java.util.Scanner;

public class PassOrFail {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int ex = scan.nextInt();
        int score = 0;
        String p = "PASS";
        String f = "FAIL";

        for (int i = 1; i <= ex; i++) {
            String attempt = scan.next();
            if (Objects.equals(attempt, p) && i < 16) {
                score += 6;
            } else if (Objects.equals(attempt, p) && i == 16) {
                score += 10;
            } else if (Objects.equals(attempt, f) && score >= 6) {
                score -= 6;
            } else if (Objects.equals(attempt, f) && score == 0) {
                score += 0;
            }
        }
        System.out.println(score);
    }
}
