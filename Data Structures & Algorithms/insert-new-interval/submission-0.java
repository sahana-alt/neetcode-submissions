class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        int n = intervals.length;
        int index = 0;
        int[][] res = new int[n+1][2];

        //first part
        int i=0;

        while(i<n && intervals[i][1]<newInterval[0]){
                res[index] = intervals[i];
                index++;
                i++;
   
        }

        while(i<n && intervals[i][0] <= newInterval[1]){ 
            newInterval[0] = Math.min( newInterval[0],intervals[i][0] );
            newInterval[1]  = Math.max( newInterval[1],intervals[i][1] );
            i++;
        }

    
        res[index] = newInterval;
        index++;



       while(i<n){
             res[index] = intervals[i];
             index++;
             i++;
        }

        return Arrays.copyOf(res, index);
        
    }
}
