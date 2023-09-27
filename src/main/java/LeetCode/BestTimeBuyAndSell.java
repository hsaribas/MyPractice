package LeetCode;

public class BestTimeBuyAndSell {

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};

        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int sell = 0;

        for (int price : prices) {
            buy = Math.min(buy, price);
            sell = Math.max(sell, price - buy);
        }

        return sell;
    }
}
