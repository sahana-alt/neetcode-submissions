class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int max =0;
        
        for(int i=0; i<n;i++){

            int h = heights[i];

            int r = i+1;

            while(r<n&& heights[r]>=h){
                r++;
            }
            int l = i;

            while(l>=0&& heights[l]>=h){
                l--;
            }
            int ar = h*(r-l-1);

            max = Math.max(max,ar);
        }

        return max;
    }
}
