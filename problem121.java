public class problem121 {
    public int maxProfit(int[] prices) {
        if(prices.length < 2) return 0;

        int min_stock = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = 0; i < prices.length-1; i++){
            min_stock = Math.min(prices[i], min_stock);
            profit = Math.max(prices[i+1] - min_stock, profit);
        }

        return profit;
    }
}
