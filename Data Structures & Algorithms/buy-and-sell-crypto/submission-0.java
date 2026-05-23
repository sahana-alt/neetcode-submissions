class Solution {
    public int maxProfit(int[] prices) {
        int i =0; 
        int j = i+1;
        int max = 0;
       
       while(j<prices.length){
        if(prices[j]>prices[i]){
            int prof = prices[j]-prices[i];
            max = Math.max(max,prof);
        }else{
            i=j;
        }
        j++;
       }
       return max;
}
    }
    
