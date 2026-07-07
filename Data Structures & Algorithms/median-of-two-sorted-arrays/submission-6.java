class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        if(n>m) return findMedianSortedArrays(nums2,nums1);

        int l = 0, h = n;

        while(l<=h){
            int mid1 = l + (h-l) / 2;
            int mid2 = (n + m + 1) / 2 - mid1;

            //numbers to the l and r of partion in nums1
            int l1 = mid1 == 0? Integer.MIN_VALUE:nums1[mid1-1];
            int r1 = mid1 == n? Integer.MAX_VALUE:nums1[mid1];

            //numbers to the l and r of partion in nums1
            int l2 = mid2 == 0? Integer.MIN_VALUE:nums2[mid2-1];
            int r2 = mid2 == m? Integer.MAX_VALUE:nums2[mid2];

            // if it is a valid partition
            if (l1 <= r2 && l2 <= r1) {

                // if the total elements are even, then median is 
          	// the average of two middle elements
            if ((n + m) % 2 == 0)
                return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
          
          	// if the total elements are odd, then median is 
         	// the middle element
            else
                return (double)Math.max(l1, l2);
        } else if(l1>r2){
            //check if u need more or less elements from a
                h=mid1-1;
                

            }else{
                l=mid1+1;
                

            }


        

           
            // if(l2<=r1){
            //     l= mid2+1;

            // }else{
            //     h=mid2-1;

            // }

        }

        return 0.0;
    }
}
