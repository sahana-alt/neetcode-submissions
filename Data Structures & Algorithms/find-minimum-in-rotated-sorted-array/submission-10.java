class Solution {
    public int findMin(int[] nums) {
        
        int l = 0;
        int h = nums.length -1;
        if (nums.length == 0) {
    return -1;  // Or any appropriate value to signify an empty array
}
        while(l<h){
            int m = l+(h-l)/2;
            if(nums[m]<nums[h]){
                    h=m;
            }else{
              l=m+1;
            }
        }
        return nums[l];
    }

    
}
