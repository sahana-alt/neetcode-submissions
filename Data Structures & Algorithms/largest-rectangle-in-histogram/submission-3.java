class Solution {
    public int largestRectangleArea(int[] heights) {

        // brute force uses two pointers get the smallest on right and 
        //left so r=i+1 and do while condition r++
        //left =i and do l--;
        //calculate area and find max for each bar
        //apna college

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


        int n = heights.length;
        int maxi =0;
        // int[] nse = new int[n];
        // int[]pse = new int[n];
        int nse=n,pse=-1;
        int elem=0;
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
             while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                elem = st.peek();
                st.pop();
                nse = i;
                pse = st.isEmpty()?-1: st.peek();
                maxi = Math.max(heights[elem]*(nse-pse-1),maxi);
             }
             st.push(i);

        }

        while(!st.isEmpty()){
            nse = n;
            elem = st.peek();
            st.pop();
            pse = st.isEmpty()?-1:st.peek();
           maxi = Math.max(heights[elem]*(nse-pse-1),maxi);
        }

        return maxi;
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
        // for(int i=0; i<n;i++){

        //     int h = heights[i];

        //     int r = i+1;

        //     while(r<n&& heights[r]>=h){
        //         r++;
        //     }
        //     int l = i;

        //     while(l>=0&& heights[l]>=h){
        //         l--;
        //     }
        //     int ar = h*(r-l-1);

        //     max = Math.max(max,ar);
        // }

        // return max;
    }
}
