class Solution {
    public int[] productExceptSelf(int[] nums) {

        int product = 0;
        int n = nums.length;

        int[] res = new int[n];

        for(int i=0;i<n;i++){
            product = 1;

            for(int j=0;j<n;j++){

                if(i!=j){
                    product*= nums[j];
                }
            }
            res[i] = product;


        }

        return res;
        
    }
}  
