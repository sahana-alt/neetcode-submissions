// class Solution {
//     public int numIslands(char[][] grid) {
//         int n = grid.length;
//         int m = grid[0].length;
//         int[][] visited = new int[n][m];
//         int c=0;

//         for(int i =0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(visited[i][j]==0 && grid[i][j] == '1'){
//                        //increase count for every bfs call 
//                        //as it gets start node
//                     bfs(i, j, grid, visited);
//                     c++; 
//                 }
//             }

//         }

//         return c;
        
//     }

//     private void bfs(int row, int col, char[][] grid, int[][] visited){
//         visited[row][col] = 1;
//         int n = grid.length;
//         int m = grid[0].length;
//         Queue<int []> q = new ArrayDeque<>();

//         q.add(new int[]{row,col});

//         while(!q.isEmpty()){
            
//             int[] set = q.poll();
//             int r = set[0];
//             int c = set[1];

//             // for(int deltar = -1;deltar<=1; deltar++){
//             //     for(int deltac = -1;deltac<=1; deltac++){
//                 //all 8 directions
//             int[] dr = {-1,0,1,0};
//             int[] dc = {0,1,0,-1};

//             for(int k=0;k<4;k++){
//                 int newr = r+ dr[k];
//                 int newc = c+ dc[k];
//                 if(newr>=0 && newr<n &&
//                 newc>= 0 && newc<m &&
//                 visited[newr][newc]==0 && grid[newr][newc] == '1'){
//                     visited[newr][newc] = 1;
//                     q.add(new int[]{newr, newc});
                    
//                 }
//             }
//             //     }

//             // }

            
//         }


//     }
// }

class Solution {
    public int numIslands(char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        int c=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1'){
                    dfs(grid,i, j);
                c++;
                }
                
            }
        }

    return c;
    }

    public void dfs(char[][] grid, int r, int c){
        if(r<0 || c<0 || r>=grid.length ||c>=grid[0].length || grid[r][c] =='0') return;

        grid[r][c] = '0'; //imp:-
        dfs(grid,r-1,c);
        dfs(grid,r,c+1);
        dfs(grid,r+1,c);
        dfs(grid,r,c-1);

        
    }
}
