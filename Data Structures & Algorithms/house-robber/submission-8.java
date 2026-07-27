class Solution {
    public int rob(int[] nums) {
        // int n = nums.length;

        // if(n==1){
        //     return nums[0];
        // }

        // int[] dp = new int[n];

       
        // dp[0] = nums[0];
        // dp[1] = Math.max(nums[0], nums[1]);
        // for(int i=2;i<n;i++){
            
        //         dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);

             
        //     }

        int[] dp = new int[nums.length];

        if(nums.length == 1){
            return nums[0];
        }

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for(int i=2;i<nums.length;i++){
            dp[i] = Math.max(dp[i-2]+nums[i],dp[i-1]);
        }



        return nums.length > 2?dp[nums.length-1]:Math.max(dp[0],dp[1]);


           



           
           
        

        // return dp[n-1];


//space optimsed
        // int prev2 = 0;
        // int prev1 = 0;

        // for (int num : nums) {
        //     int curr = Math.max(prev1, num + prev2);
        //     prev2 = prev1;
        //     prev1 = curr;
        // }

        // return prev1;
    

        
    }
}
