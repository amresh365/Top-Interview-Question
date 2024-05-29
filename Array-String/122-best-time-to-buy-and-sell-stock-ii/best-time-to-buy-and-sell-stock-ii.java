class Solution {
    public int maxProfit(int[] prices) {
          int n = prices.length;
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {
                // If the current price is greater than the previous day's price,
                // sell the stock and add the profit to maxProfit.
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }
}