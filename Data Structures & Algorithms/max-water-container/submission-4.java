class Solution {
    public int maxArea(int[] heights) {

        int n = heights.length;

        int l =0, r = n-1;
        int maxArea = 0;


        while(l<r){
            int area = Math.min(heights[l],heights[r])*(r-l);

            System.out.print(area+" "+ l +" "+r+"\n");

            

            if(heights[l]<heights[r]){
                l++;
            }else{
                r--;
            }
            maxArea = Math.max(maxArea,area);

        }

        return maxArea;
        
    }
}
