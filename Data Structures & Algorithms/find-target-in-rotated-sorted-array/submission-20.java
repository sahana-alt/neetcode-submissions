class Solution {
    public int search(int[] nums, int target) {
        //check left sorted arr[l]<=m
        // or right sorted 
        // in that check if target is present where
        // in sorted part or pivoted target is between m and l
        // or m and h
        // accordindinly within each conmdition u update l and h
    //     int n = nums.length;
    //     int l =0;
    //     int h = n-1;

    //     while(l<=h){
    //         int m = l+((h-l)/2);

    //         if(nums[m]== target){
    //             return m;
    //         }

    //         if(nums[l]<=nums[m]){
    //             if(nums[l]<=target && target<=nums[m]){
    //                 h=m-1;
    //             }else{
    //                 l=m+1;
    //             }
    //         }
    //         else{
    //             if(nums[m]<=target && target<=nums[h]){
    //                l=m+1;;
    //             }else{
    //                 h=m-1;
    //             }
    //         }
          
    //     }
    // return -1;

     int n = nums.length;
        int l =0;
        int h = n-1;

        while(l<=h){
            int m = l+(h-l)/2;

            if(target == nums[m]){
                 return m;

            } else if(nums[l]<=nums[m]){
                //sorted left
                if (nums[l] <= target && target < nums[m]) {
                h = m - 1;
                } else {
                    l = m + 1;
                }
                    
            }else {

                if(target>nums[m] && target<=nums[h]){
                    l=m+1;

                }else{
                    h=m-1;
                    
                }
               
            }
        }

        return -1;
        
    }
}
