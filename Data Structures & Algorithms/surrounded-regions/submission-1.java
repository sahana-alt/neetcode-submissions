class Solution {
    public void solve(char[][] board) {

        int r = board.length;
        int c = board[0].length;


        boolean[][] visited = new boolean[r][c];



        for(int i=0;i<r;i++){

            //first col and last col
            if(!visited[i][0] && board[i][0] == 'O'){
                dfs(i,0,board,visited);
            }

            if(!visited[i][c-1] && board[i][c-1] == 'O'){
                dfs(i,c-1,board,visited);
            }
        }

         for(int i=0;i<c;i++){

            //first row and last row
            if(!visited[0][i] && board[0][i] == 'O'){
                dfs(0,i,board,visited);
            }

            if(!visited[r-1][i] && board[r-1][i] == 'O'){
                dfs(r-1, i,board,visited);
            }
        }
        for(int i=0;i<r;i++){
            for(int j =0;j<c;j++){
                System.out.println(visited[i][j]+" ");
            }
            System.out.println("\n");
        }
       

        for(int i=0;i<r;i++){
            for(int j =0;j<c;j++){
                if(!visited[i][j] && board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }



        // int r = board.length;
        // int c = board[0].length;
        // int[][] visited = new int[r][c];
        
        // //check boundaries

        // //first row and last row

        // for(int i=0;i<c;i++){

        //     if(visited[0][i] == 0 && board[0][i] == 'O'){
        //         dfs(0,i,board,visited);

        //     }

        //     if(visited[r-1][i] == 0 && board[r-1][i] == 'O'){
        //         dfs(r-1,i,board,visited);

        //     }
        // }

        // //first and last col
        // for(int j=0;j<r;j++){

        //     if(visited[j][0] == 0 && board[j][0] == 'O'){
        //         dfs(j,0,board,visited);

        //     }
        //     if(visited[j][c-1] == 0 && board[j][c-1] == 'O'){
        //         dfs(j,c-1,board,visited);

        //     }

        // }

        // for(int j=0;j<r;j++){
        //     for(int i=0;i<c;i++){
        //         if(visited[j][i] == 0 && board[j][i] == 'O'){
        //             board[j][i] = 'X';
        //         }
        //     }
        // }
        
    }

    // public void dfs(int r, int c, char[][] board,int[][] visited){
    //     visited[r][c] = 1;
    //     int n = board.length;
    //     int m = board[0].length;
    //     int[] dr = {-1,0,1,0};
    //     int[] dc ={0,1,0,-1};

    //     for(int i=0;i<4;i++){
    //         int nr = r+dr[i];
    //         int nc = c+dc[i];

    //         if(nr>=0 && nr<n && nc>=0 && nc<m && 
    //         visited[nr][nc] == 0 && board[nr][nc] == 'O'){
    //             dfs(nr,nc, board, visited);
    //         }
    //     }

        
    // }

    public void dfs(int r, int c , char[][] board, boolean[][] visited){
        if(visited[r][c]) return;
        visited[r][c] = true;

        int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0,-1};

        for(int k =0;k<4;k++){
            int nr = r+dr[k];
            int nc = c+dc[k];

            if(nr>=0 && nc>=0 && nr<board.length && nc<board[0].length 
            && board[nr][nc] == 'O'){

                dfs(nr,nc,board,visited);
            }
        }
    }
}
