class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int lmax = 0, rmax = 0, area =0;

        while(l<r){
            if(height[l]<height[r]){
                if(lmax> height[l]){
                    area+= lmax - height[l];
                }else{
                    lmax = height[l];
                }
                l++;
            }else{
                if(rmax> height[r]){
                    area+= rmax - height[r];
                }else{
                    rmax = height[r];
                }
                r--;
            }
            
        }
        return area;
        // if(n==0){
        //     return 0;
        // }
        // int[] left = new int[n];
        // int[] right = new int[n];
        // left[0] = height[0];
        // for(int i =1;i<n;i++){
        //    left[i] = Math.max(left[i-1],height[i]);
        //    System.out.println(left[i]+" ");
        // }

        // right[n-1] = height[n-1];

        // for(int j = n-2;j>=0;j--){
        //     right[j] = Math.max(right[j+1],height[j]);
        //     System.out.println(right[j]+" ");
        // }

        // int res = 0;
        // for(int k =0;k<n;k++){
        //     res += Math.min(left[k],right[k]) - height[k];
        // }
        // return res;
        
    }
}
