class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;

        for(int i=0;i<n-1;i++){
            for(int j =i+1;j<n;j++){
                if(prices[j]>prices[i]){
                    int p = prices[j]-prices[i];
                    if(p>maxProfit){
                        maxProfit = p;

                    }

                }

            }
        }

        return maxProfit;
        
    }
}
