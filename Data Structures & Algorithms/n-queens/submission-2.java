class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        int[] leftRow = new int[n];
        char[][] board = new char[n][n];
        int[] upperDiagonal = new int[2*n-1]; //remember the vuisualisation fro, videp
        int[] lowerDiagonal = new int[2*n-1];

        //imp:- filling rows in matrix
        for(char [] row: board){
            Arrays.fill(row,'.');
        }

        nQueen(0,n,board, leftRow, upperDiagonal, lowerDiagonal, res);

        return res;
        
    }

    public void nQueen(int c, int n, char[][] board, int[] leftRow, 
    int[] upperDiagonal, int[] lowerDiagonal, List<List<String>> res){

        if(c==n){
           List<String> temp = new ArrayList<>();
           for(int i=0;i<n;i++){
            temp.add(new String(board[i]));
           }
           res.add(temp);
            return;
        }


        
        // for(int r=0;r<n;r++){   //move rows in everybacktrackingf- visualise

        //     if(leftRow[r] == 0 && lowerDiagonal[r+c]==0 && upperDiagonal[n-1+c-r]==0){
        //         //condition is important
        //         //dont mess up inddices and nanes- lower- r+c
        //         //uppeer - n-1+c-r
        //         board[r][c] = 'Q';
        //         leftRow[r] = 1;
        //         lowerDiagonal[r+c] = 1;
        //         upperDiagonal[n-1+c-r] = 1;
        //         nQueen(c+1,n, board, leftRow, upperDiagonal, lowerDiagonal, res );
        //         board[r][c] = '.';
        //         leftRow[r] = 0;
        //         lowerDiagonal[r+c] = 0;
        //         upperDiagonal[n-1+c-r] = 0;


        //     }
                
        // }

        for(int r=0;r<n;r++){
            if(leftRow[r] == 0 && lowerDiagonal[r+c]==0 && upperDiagonal[n-1+c-r] ==0 ){
                board[r][c] = 'Q';
                leftRow[r] = 1;
                lowerDiagonal[r+c]= 1;
                upperDiagonal[n-1+c-r] = 1;
                nQueen(c+1,n,board, leftRow, upperDiagonal, lowerDiagonal, res);
                 board[r][c] = '.';
                leftRow[r] = 0;
                lowerDiagonal[r+c]= 0;
                upperDiagonal[n-1+c-r] = 0;

            }
        }
    }
}
