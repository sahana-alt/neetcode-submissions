class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int outputSize = n - k + 1;
        int[] ar = new int[outputSize];
        int max = nums[0];
        int l=0;
        
        for(int i=0;i<=n-k;i++){
            max = nums[i];
            System.out.println(i+" in first loop");
            for(int j=i;j<k+i;j++){
                System.out.println(j+" in second loop");
                max = Math.max(nums[j],max);

            }
            ar[l] =  max;
            l++;
        }
        return ar;
    }
}
