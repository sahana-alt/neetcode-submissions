class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[]res = new int[n];
        for(int i=0;i<n;i++){
             int diff=0;
            for(int j=i+1;j<n;j++){
               
                if(temperatures[j]>temperatures[i]){
                   diff = j-i;
                   break;
                }

            }
            res[i] = diff;
        }

        return res;
    }
}
