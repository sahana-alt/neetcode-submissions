class Solution {
    public int longestConsecutive(int[] nums) {

        // Arrays.sort(nums);
        // int n = nums.length;

        // if(n==0 || n==1){
        //     return n;
        // }

        // int cur = 1;
        // int maxi = 1;

        // for(int i=1;i<n;i++){
        //     if(nums[i] == nums[i-1]){
        //         continue;

        //     }else if(nums[i]== nums[i-1]+1){
        //         cur++;
        //     }else{
        //         cur = 1;
        //     }

        //     maxi = Math.max(cur,maxi);


        // }

        // return maxi;


        int n = nums.length;

        if(n==0 || n==1){
            return n;
        }

        Set<Integer> st = new HashSet<>();

        int longest = 1;

        int j = 0;
        int len = 0;
     

        for(int num: nums){
            st.add(num);
        }

        if(st.size() == 0 || st.size() == 1){
            return st.size();
        }

       for(int num:st){
        if(!st.contains(num-1)){
            len = 1;
            int cur = num;

            while(st.contains(cur+1)){
                cur++;
                len++;
            }

            

        }
        longest = Math.max(longest,len);
       }

       return longest;
    }
}
