class Solution {
    public int findMin(int[] nums) {
        //brute force is normal traversal and finding min
        // TC is o(n)

        //optimised binary search
        // update min twicw, second uopdation is in. case
        // the m value is less than min
        // first if condition is if it is sorted
        int min = Integer.MAX_VALUE;
        int l=0;
        int h = nums.length-1;

        while(l<=h){
            if(nums[l]<=nums[h]){
                min = Math.min(min,nums[l]);
                
            }

            int m = l+((h-l)/2);
            min = Math.min(min, nums[m]);  
            if(nums[m]<nums[l]){
                h=m-1;
            }else{
                l=m+1;
            }
        }

        return min;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]<min){
        //         min = nums[i];
        //     }
        // }

        //return min;
        
    }
}
