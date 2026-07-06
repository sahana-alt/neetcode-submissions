class Solution {
    public int largestRectangleArea(int[] heights) {

        // brute force uses two pointers get the smallest on right and 
        //left so r=i+1 and do while condition r++
        //left =i and do l--;
        //calculate area and find max for each bar
        //apna college

                // int n = heights.length;
        // int maxArea = 0;

        // for(int i =0;i<n;i++){
        //     int mini = Integer.MAX_VALUE, area =0;

        //     for(int j =i;j<n;j++){

        //         mini = Math.min(heights[j],mini);
        //         int w = j-i+1;
        //         area = Math.max(mini*w, area);
        //     }

        //     maxArea = Math.max(area,maxArea);
        // }

        // return maxArea;
    // }

//optimised soln
//2 arrays for pse and nse* imp:- next greatest, prev smallest concept
// height is const as u have to get max artea for that bar
// width varies- nse-pse-1
// bpuindary for nse is n as if no small ekement next then n
// for pse its -1
//this is also because nse -pse-1, nse should be > pse for +ve val
// this way fuind max
//mistakes:- >= in while condition
// st.clear, using same stacl for nse and pse

//one pass best solution
//do pse as u will go 0 to n unlike n-1 to 0 for nse
//update nse while u do thise
//put a loop for all remaining stack elements, 
// these didnt have nse
//mistake-did pse-nse-1


        // int n = heights.length;
        // int maxi =0;
        // // int[] nse = new int[n];
        // // int[]pse = new int[n];
        // int nse=n,pse=-1;
        // int elem=0;
        // Stack<Integer> st = new Stack<>();

        // for(int i=0;i<n;i++){
        //      while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
        //         elem = st.peek();
        //         st.pop();
        //         nse = i;
        //         pse = st.isEmpty()?-1: st.peek();
        //         maxi = Math.max(heights[elem]*(nse-pse-1),maxi);
        //      }
        //      st.push(i);

        // }

        // while(!st.isEmpty()){
        //     nse = n;
        //     elem = st.peek();
        //     st.pop();
        //     pse = st.isEmpty()?-1:st.peek();
        //    maxi = Math.max(heights[elem]*(nse-pse-1),maxi);
        // }

        // return maxi;
        // for(int i=0;i<n;i++){
           
        //     while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
        //         st.pop();
        //     }

        //     if(st.isEmpty()){
        //          pse[i] = -1;
        //     }else{
        //         pse[i] = st.peek();
        //     }
            

        //     st.push(i);

        // }
        //  st.clear();
        // for(int i=n-1;i>=0;i--){
           
        //     while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
        //         st.pop();
        //     }

        //     if(st.isEmpty()){
        //          nse[i] = n;
        //     }else{
        //         nse[i] = st.peek();
        //     }
            

        //     st.push(i);

        // }
        
        // for(int i=0;i<n;i++){
        //     int area = heights[i]*(nse[i]-pse[i]-1);
          
        //     maxi = Math.max(area,maxi); 
        // }

       // return maxi;


       int n = heights.length;
       Stack<Integer> st = new Stack<>();
       int[] right = new int[n];

       for(int r=n-1;r>=0;r--){
        //stores right smallest
        while(!st.isEmpty() && heights[st.peek()]>=heights[r]){
            st.pop();
        }

        right[r] = st.isEmpty()? n: st.peek();
        

        st.push(r);
       }

       int[] left = new int[n];
       st.clear();

       //left smallest
       for(int l=0;l<n;l++){
        
        while(!st.isEmpty() && heights[st.peek()]>=heights[l]){
            st.pop();
        }

        left[l] = st.isEmpty()? -1: st.peek();
        st.push(l);
       }


        //area calculation

        int area = Integer.MIN_VALUE;

       for(int i =0;i<n;i++){
       
       // so r should be r-1 
        int w = right[i]-1 - left[i];
        int h = heights[i];

        area = Math.max(w*h, area);

       }

       return area;


}
}
