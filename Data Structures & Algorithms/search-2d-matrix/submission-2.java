class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int h =n*m-1;

      
        while(l<=h){
            int mid = (l+h)/2;
            int mrow = mid/m;
            int mcol = mid%m;
            if(matrix[mrow][mcol] == target){
                return true;
            }else if(target> matrix[mrow][mcol]){
                l = mid +1;
            }else{
                h = mid-1;
            }
        }
    return false;
    }
}
