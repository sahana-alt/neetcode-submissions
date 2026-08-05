class Solution {
    public int maxProduct(int[] nums) {

        if(nums.length<1){
            return 0;
        }
        int maxSoFar= nums[0];
        int minSoFar = nums[0];
        int ans = nums[0];

        for(int i=1;i<nums.length;i++){
            int num = nums[i];

            int tempMax = Math.max(num, Math.max(maxSoFar*num,minSoFar*num));
            int tempMin = Math.min(num, Math.min(maxSoFar*num,minSoFar*num));

            maxSoFar = tempMax;
            minSoFar = tempMin;

            ans = Math.max(maxSoFar,ans);


        }

        return ans;
        
    }
}
