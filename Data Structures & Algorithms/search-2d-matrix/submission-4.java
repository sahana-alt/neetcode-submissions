class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
//brute force is 2 loops
//for optimised should do binry search
// i should treat every row like a array
        int n = matrix.length;
        int m = matrix[0].length;
        int l =0;
        int h = n*m-1;

        while(l<=h){
            int mid = l+((h-l)/2);
            int mVal = matrix[mid/m][mid%m];
            System.out.println(mVal);

            if(target<mVal){
                h=mid-1;
            }
            else if(target>mVal){
               l=mid+1;
            }else{
                return true;
            }
        }

        return false;
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
