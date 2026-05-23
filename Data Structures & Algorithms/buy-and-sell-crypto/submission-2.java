class Solution {
    public int maxProfit(int[] prices) {
        //int n = prices.length;
        //int maxprof = Integer.MIN_VALUE;
        int prof = 0;
        int i = 0;
        int j = i+1;
          int n = prices.length;
        int maxprof = 0;

        while(j<prices.length){
            if(prices[j]>prices[i]){
                prof = prices[j]-prices[i];
                maxprof= Math.max(maxprof,prof);
            }else{
                i=j;
            }
            j+=1;
        }
        return maxprof;
    }
}
