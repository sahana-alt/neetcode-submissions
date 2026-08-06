class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] dp = new int[n];

        for (int i = 1; i < n; i++) {
            dp[i] = dp[i - 1]; // don't sell today

            for (int j = 0; j < i; j++) {
                int profitBeforeBuy = j >= 2 ? dp[j - 2] : 0;
                int profitIfSellToday = prices[i] - prices[j] + profitBeforeBuy;

                dp[i] = Math.max(dp[i], profitIfSellToday);
            }
        }

        return dp[n - 1];
    }
}