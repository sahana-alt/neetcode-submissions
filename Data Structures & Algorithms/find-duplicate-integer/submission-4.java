class Solution {
    public int findDuplicate(int[] nums) {
        // Set<Integer> st = new HashSet<>();

        // for(int i=0;i<nums.length;i++){
        //     int num = nums[i];

        //     if(st.contains(nums[i])){
        //         return nums[i];
        //     }
        //     st.add(nums[i]);

      
        // }
        //   return -1;

        //usig binary search
        // in 1,2,3,4,2 n =5 so numbers are in 1 to 4
        // we calculare mid
        // here mid =2
        // we count for num<=mid number of numbers <mid
        //if count>mid here we get 3>2 indicates a duplicate
        //is in lower half i.e before mid

        int l =1;   //imo:- val cant be zero
        int n= nums.length-1;
        int h =n;

        while(l<h){
            int m = l+((h-l)/2);
            int c=0;

            for(int num:nums){
                if(num<=m){
                    c++;
                }

            }

            if(c>m){
                h=m;    //duplicare in lower
            }else{
                l=m+1;
            }
        }

        return l;   // indexes are the values array is a black box

    }
}
