package problem122;
class Solution {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) { // buy
                profit += (prices[i + 1] - prices[i]);
            }
        }
        return profit;
    }
}

public class problem122 {
    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        if (Solution.maxProfit(prices) == 7) {
            System.out.println("SUCCESS");
        }
    }
}