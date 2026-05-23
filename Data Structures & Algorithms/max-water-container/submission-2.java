class Solution {
    public int maxArea(int[] heights) {
         int st=0;
         int e= heights.length-1;
         int maxArea = 0;
         

         while(st<e){
            int l = Math.min(heights[st],heights[e]);

            int w = Math.abs(e-st);
            int area = l*w;
            System.out.println(heights[st]+" "+heights[e]);
            maxArea = Math.max(area,maxArea);
            if(heights[st]<heights[e]){
                st++;
            }else{
                e--;
            }
            
            
         }
    return maxArea;
    }
}
