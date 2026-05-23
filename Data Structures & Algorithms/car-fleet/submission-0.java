class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> st = new Stack<>();
        int n = position.length;
        double[][] res = new double[n][2];
        int count =0;

        for(int i=0;i<n;i++){
            res[i][0] = position[i];
             res[i][1] = (double)(target-position[i])/speed[i];
        }

        Arrays.sort(res,(a,b)->Double.compare(b[0], a[0]));

       
         for(int i=0;i<n;i++){
            double[] pair = res[i];
           if (!st.isEmpty() && pair[1] <= st.peek()) {
                continue;
            }
           count+=1;
           st.push(pair[1]);
         }

        return count;
    }
}
