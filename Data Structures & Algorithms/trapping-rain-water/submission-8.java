class Solution {
    public int trap(int[] height) {

        int l =0;
        
        int n = height.length;

        int r=n-1;

        int[] areas = new int[n];

        if(n==0 || n==1){
            return 0;
        }

       int leftMax = 0, rightMax = 0;
       int water = 0;
       int i =0;

       while(l<r){

        if(height[l]<height[r]){
            if(height[l]> leftMax){
                leftMax = height[l];

            } else{
                water += leftMax-height[l];
            }
            l++;
        }else{
            if(height[r]> rightMax){
                rightMax = height[r];

            } else{
                water += rightMax-height[r];
            }

            r--;

        }

        
       }
        

        return water;

        
        
    }
}
