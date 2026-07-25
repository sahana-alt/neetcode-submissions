class Solution {
    public int maxSubArray(int[] nums) {

        int n = nums.length;
        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        int start = -1;
        int sumStart = -1;
        int sumEnd=-1;

        for(int i=0;i<n;i++){
            if(sum == 0){
                start = i;
            }
            sum+=nums[i];
            //starting of sum
       
            if(sum>maxi){
                maxi = sum;
                sumStart = start;
                sumEnd = i;
            }

            if(sum<0){
                sum = 0;
            }

        }

        return maxi;
        
    }
}
