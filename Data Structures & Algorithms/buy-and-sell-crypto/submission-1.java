class Solution {
    public int maxProfit(int[] prices) {
        //int n = prices.length;
        //int maxprof = Integer.MIN_VALUE;
        int prof = 0;
       // int i = 0;
       // int j = i+1;
          int n = prices.length;
        int maxprof = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxprof) {
                    maxprof = profit;
                }
            }
        }
        return maxprof;
    }
}
