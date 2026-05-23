class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //brute force:- traverse store the diff in an array return
        // monotonic stack-next macx next min, store pairs
        int n = temperatures.length;
        
        int[]res = new int[n];
        for(int i=n-2;i>=0;i--){
            int j=i+1;
            while(j<n && temperatures[j]<=temperatures[i]){  //bpundary condition for skipping cold days
                if(res[j]==0){
                    j=n;    //there is no warmer day after this
                    break;
                }
                j+=res[j];  //updating j to next warmer d
            }
            if(j<n){
                res[i] = j-i;
            }
        }

        return res;
    }
}
