class Solution {
    public int rob(int[] nums) {
        int[]dp = new int[nums.length];

         if(nums.length == 1){
            return nums[0];
        }

        

        dp[0] = nums[0];
        dp[1] = Math.max(nums[1],nums[0]);

        if(nums.length == 2){
            return dp[1];
        }



       return Math.max(rob(0,nums.length-1, nums,dp),rob(1,nums.length, nums,dp));
        
    }

    public int rob(int st,int e,int[] nums,int[] dp){

       

        dp[st] = nums[st];
        dp[st+1] = Math.max(nums[st+1],nums[st]);

        for(int i=st+2;i<e;i++){
            dp[i] = Math.max(dp[i-2]+nums[i],dp[i-1]);
        }

        return dp[e-1];
    }
}
