class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int area = 0;
        int max = Integer.MIN_VALUE;
        int l = 0;
        int r = n-1;
        while(l<=r){
            area = Math.min(heights[l],heights[r]) *(r-l);
            if(heights[l]<heights[r]){
                l++;
            }else{
                r--;
            }
            max = Math.max(area,max);
        }
        
        return max;
    }
}
