class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
//brute force is 2 loops
//for optimised should do binry search
// i should treat every row like a array
//tc - o(m*n) sc- 0(1)

//staircase search r<n and c>=0;
//start with r=0 and c=m-1;
//traverse, c-- and r++accordingly
// Time Complexity: O(m + n), where m = number of rows, n = number of columns
// Space Complexity: O(1)


//optimised - h=r*c-1 ,
//u flatten array
//row = index/c, col = index%c
//get midval and do normal binary
//tc - o(log m*n) sc- 0(1)
//mistake if else if
        // int n = matrix.length;
        // int m = matrix[0].length;
        // int l =0;
        // int h = n*m-1;
        // int r=0,c=m-1;

        // while(l<=h){
        //     int mid = l+((h-l)/2);
        //     int mVal = matrix[mid/m][mid%m];
        //     System.out.println(mVal);

        //     if(target<mVal){
        //         h=mid-1;
        //     }
        //     else if(target>mVal){
        //        l=mid+1;
        //     }else{
        //         return true;
        //     }
        // }

        // return false;

        int n = matrix.length;
        int m = matrix[0].length;
        int l =0;
        int r = n*m-1;

        while(l<=r){
            int mid = l+(r-l)/2;
            int mVal = matrix[mid/m][mid%m];

            if(target==mVal){
                return true;
            }
            else if(target<mVal){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }

        return false;




        // while(r<n &&c>=0){
        //      if(target<matrix[r][c]){
        //        c--;
        //     }
        //     else if(target>matrix[r][c]){
        //        r++;
        //     }else{
        //         return true;
        //     }
        // }
        // return false;
        // for(int i=0;i<n;i++){
        //       for(int j=0;j<m;j++){
        //         if(matrix[i][j] == target){
        //             return true;
        //         }
        //       }

        // }
        //  return false;
        
    }
}
