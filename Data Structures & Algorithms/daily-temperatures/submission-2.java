class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //brute force:- traverse store the diff in an array return
        // monotonic stack-next macx next min, store pairs
        int n = temperatures.length;
        Stack<int[]> st = new Stack<>();
        int[]res = new int[n];
        for(int i=0;i<n;i++){
            int t = temperatures[i];
            while(!st.isEmpty() && t>st.peek()[0]){
                int ind = i- st.peek()[1];
                
                res[st.peek()[1]] = ind;
                st.pop();
            }
            st.push(new int[]{t,i});
        }

        return res;
    }
}
