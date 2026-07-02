class Solution {
    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;

        if(n==0 || n==1){
            return n;
        }

        int cur = 1;
        int maxi = 1;

        for(int i=1;i<n;i++){
            if(nums[i] == nums[i-1]){
                continue;

            }else if(nums[i]== nums[i-1]+1){
                cur++;
            }else{
                cur = 1;
            }

            maxi = Math.max(cur,maxi);


        }

        return maxi;
        
    }
}
