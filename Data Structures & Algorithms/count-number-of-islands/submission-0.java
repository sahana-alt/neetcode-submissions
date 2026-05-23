class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int [][] visited = new int[n][m];
        int cnt=0;

        for(int i =0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j] == '1' && visited[i][j] == 0){
                        bfs(grid,visited,i,j);
                        cnt++;
                }
            }

        }
        return cnt;
    }

    public void bfs(char[][] grid, int[][] visited, int i, int j){
        Queue<int[]> q = new LinkedList<>();
        visited[i][j] = 1;
        q.add(new int[]{i,j});
        int[] drow = { -1, 0, 1, 0 };
        int[] dcol = { 0, 1, 0, -1 };
        while(!q.isEmpty()){
            int [] p = q.poll();
            int r = p[0];
            int c = p[1];
            for(int k = 0;k<4;k++){
                int nrow = r+drow[k];
                int ncol = c+dcol[k];
                if(nrow>=0  && nrow < grid.length && ncol >= 0 && ncol < grid[0].length  && grid[nrow][ncol] == '1'  && visited[nrow][ncol]== 0){
                        q.add(new int[]{nrow,ncol});
                        visited[nrow][ncol] = 1;
                }
            }


        }
    }
}
