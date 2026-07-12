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

            area++;

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
            

        }
        return area;
    }
}

// class Solution {
//     public int maxAreaOfIsland(int[][] grid) {
//         int n = grid.length;
//         int m = grid[0].length;
//         int area = 0;
        
//         // int area=0;
//         int maxArea = 0;

//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){

//                 if(grid[i][j] == 1){
//                     maxArea= Math.max(maxArea,dfs(grid,i,j));
//                 }
                
                
//             }
//         }
//        return maxArea; 


//     }

//     public int dfs(int[][] grid, int r,int c ){
//         int area = 0;
//         if(r<0 || c<0 || r>=grid.length || c>=grid[0].length|| grid[r][c]==0){
//             return area;
//         }

      
//         grid[r][c] = 0;
        
        
        
        
//         return 1+dfs(grid,r-1,c)+
//         dfs(grid,r,c+1)
//         +dfs(grid,r+1,c)
//         +dfs(grid,r,c-1);
    
//     }

// }
