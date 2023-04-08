package Practice;

public class MakingRectangle {

    public static void main(String[] args) {
        int height = 5;
        int width = 7;
        char ch = '$';

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
