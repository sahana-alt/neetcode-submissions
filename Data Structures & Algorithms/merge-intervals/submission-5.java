class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int n = intervals.length;
        int index = 0;
        int i=0;

        int[][] res = new int[n][2];
        while(i<n){
            if(index == 0 || res[index-1][1]<intervals[i][0]){

                res[index] = intervals[i];
                index++;

                //  System.out.println("in first loop"+res[res.length-1][1]+" "+res[index][1]);
            
                // System.out.println("in first loop"+res[index][0]+" "+res[index][1]);

            }else{
                
                res[index-1][1] =  Math.max(res[index-1][1],intervals[i][1]);
                // res[index-1][0] =  Math.min(res[index-1][0],intervals[i][0]);


            }
         
            i++;
        }

        return Arrays.copyOf(res,index);
        
    }
}
