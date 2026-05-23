class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int area = 0;
        int[][] visited = new int[n][m];
        // int area=0;
        int maxArea = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                if(visited[i][j]==0 && grid[i][j] == 1){
                    maxArea= Math.max(maxArea,bfs(grid,i,j,visited));
                }
                
                
            }
        }
       return maxArea; 
    }

    public int bfs(int[][] grid,int r, int c, int[][]visited){
        Queue<int[]> q = new ArrayDeque<>();
        visited[r][c]=1;
        q.add(new int[]{r,c});
        int area =0;
        

        while(!q.isEmpty()){
            
            int[] set = q.poll();
            int nrow = set[0];
            int newc = set[1];

            int[] dr = {-1,0,1,0};
            int[] dc = {0,1,0,-1};

            for(int k=0;k<4;k++){
                int nr = nrow+dr[k];
                int nc = newc +dc[k];

                if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length
                && visited[nr][nc]==0 && grid[nr][nc]==1){
                     
                    visited[nr][nc]=1;
                    q.add(new int[]{nr,nc});
                    
                    
                }
            }
            area++;

        }
        return area;
    }
}
