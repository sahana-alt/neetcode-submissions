class Solution {
    public int[] productExceptSelf(int[] nums) {

        // int product = 0;
        int n = nums.length;

        // int[] res = new int[n];

        // for(int i=0;i<n;i++){
        //     product = 1;

        //     for(int j=0;j<n;j++){

        //         if(i!=j){
        //             product*= nums[j];
        //         }
        //     }
        //     res[i] = product;


        // }

        // return res;

        int[] prefix = new int[n];
        prefix[0] = 1;

        int[] suffix = new int[n];
        suffix[n-1] = 1;
        int[] res = new int[n];

        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1]*nums[i-1];
        }

         for(int i=n-2;i>=0;i--){
            suffix[i] = suffix[i+1]*nums[i+1];
        }

         for(int i=0;i<n;i++){
            res[i] = prefix[i]*suffix[i];
         }

         return res;


        
    }
}  
