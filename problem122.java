//Best Time to Buy and Sell Stock II
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 0; i < prices.length-1; i++){
            if(prices[i+1] > prices[i]) { //buy
                profit += (prices[i+1] - prices[i]);
            }
        }

        return profit;
    }
}