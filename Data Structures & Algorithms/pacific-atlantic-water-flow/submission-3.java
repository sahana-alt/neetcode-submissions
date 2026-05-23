class Solution {
 
    // public List<List<Integer>> pacificAtlantic(int[][] heights) {

    //     int r = heights.length;
    //     int c = heights[0].length;
    //     int[] dr = {-1,0,1,0};
    //     int[] dc = {0,1,0,-1};
    //     List<List<Integer>> res = new ArrayList<>();
        

    //     for(int i=0;i<r;i++){
    //         for(int j=0;j<c;j++){
    //             boolean[] ocean = new boolean[2]; //pac and atl
    //             boolean[][] visited = new boolean[r][c];

    //             dfs(i,j, heights, visited,ocean);
    //             if(ocean[0] && ocean[1]){
    //                 res.add(Arrays.asList(i,j));

    //             }
    //         }
    //     }

    //     return res;

    // }


    // public void dfs(int r, int c, int[][] heights, boolean[][] visited, boolean[] ocean){
    //     if(visited[r][c]) return;
    //     visited[r][c] = true;

    //     if(r==0 || c==0) ocean[0] = true;

    //     if(r==heights.length-1 || c== heights[0].length-1) ocean[1] = true;

    //     int[] dr = {-1,0,1,0};
    //     int[] dc = {0,1,0,-1};

    //     for(int i=0;i<4;i++){
    //         int nr = r+dr[i];
    //         int nc = c+dc[i];

    //         if(nr>=0 && nr<heights.length && nc>=0 && nc< heights[0].length
    //         && !visited[nr][nc] && heights[nr][nc]<=heights[r][c]){
    //              dfs(nr, nc, heights, visited, ocean);
    //         }
    //     }


    // }


    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        int r = heights.length;
        int c = heights[0].length;
        int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0,-1};
          boolean[][] pacific = new boolean[r][c];
        boolean[][] atlantic = new boolean[r][c];


        List<List<Integer>> res = new ArrayList<>();
        

        for(int i=0;i<c;i++){
            dfs(0,i,heights, pacific);
            dfs(r-1,i, heights,atlantic);
        }
        for(int i=0;i<r;i++){
            dfs(i,0,heights, pacific);
            dfs(i,c-1, heights,atlantic);
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(pacific[i][j] && atlantic[i][j]){
                    res.add(Arrays.asList(i,j));
                }
            }
        }

        return res;

    }


    public void dfs(int r, int c, int[][] heights, boolean[][] visited){
        if(visited[r][c]) return;
        visited[r][c] = true;


        int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0,-1};

        for(int i=0;i<4;i++){
            int nr = r+dr[i];
            int nc = c+dc[i];

            if(nr>=0 && nr<heights.length && nc>=0 && nc< heights[0].length
            && !visited[nr][nc] && heights[nr][nc]>=heights[r][c]){
                 dfs(nr, nc, heights, visited);
            }
        }


    }
      

       

        
    
}
