class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int area = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                area = Math.min(heights[i],heights[j])*(j-i);
                System.out.println("Areas for"+ heights[i]+" "+area);
                max = Math.max(area,max);

            }
            
        }
        return max;
    }
}
