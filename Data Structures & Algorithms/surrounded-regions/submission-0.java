class Solution {
    public void solve(char[][] board) {

        int r = board.length;
        int c = board[0].length;
        int[][] visited = new int[r][c];
        
        //check boundaries

        //first row and last row

        for(int i=0;i<c;i++){

            if(visited[0][i] == 0 && board[0][i] == 'O'){
                dfs(0,i,board,visited);

            }

            if(visited[r-1][i] == 0 && board[r-1][i] == 'O'){
                dfs(r-1,i,board,visited);

            }
        }

        //first and last col
        for(int j=0;j<r;j++){

            if(visited[j][0] == 0 && board[j][0] == 'O'){
                dfs(j,0,board,visited);

            }
            if(visited[j][c-1] == 0 && board[j][c-1] == 'O'){
                dfs(j,c-1,board,visited);

            }

        }

        for(int j=0;j<r;j++){
            for(int i=0;i<c;i++){
                if(visited[j][i] == 0 && board[j][i] == 'O'){
                    board[j][i] = 'X';
                }
            }
        }
        
    }

    public void dfs(int r, int c, char[][] board,int[][] visited){
        visited[r][c] = 1;
        int n = board.length;
        int m = board[0].length;
        int[] dr = {-1,0,1,0};
        int[] dc ={0,1,0,-1};

        for(int i=0;i<4;i++){
            int nr = r+dr[i];
            int nc = c+dc[i];

            if(nr>=0 && nr<n && nc>=0 && nc<m && 
            visited[nr][nc] == 0 && board[nr][nc] == 'O'){
                dfs(nr,nc, board, visited);
            }
        }

        
    }
}
