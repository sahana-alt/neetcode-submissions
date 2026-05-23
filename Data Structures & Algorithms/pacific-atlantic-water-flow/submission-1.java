class Solution {
 
    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        int r = heights.length;
        int c = heights[0].length;
        int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0,-1};
        List<List<Integer>> res = new ArrayList<>();
        

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                boolean[] ocean = new boolean[2]; //pac and atl
                boolean[][] visited = new boolean[r][c];

                dfs(i,j, heights, visited,ocean);
                if(ocean[0] && ocean[1]){
                    res.add(Arrays.asList(i,j));

                }
            }
        }

        return res;

    }


    public void dfs(int r, int c, int[][] heights, boolean[][] visited, boolean[] ocean){
        if(visited[r][c]) return;
        visited[r][c] = true;

        if(r==0 || c==0) ocean[0] = true;

        if(r==heights.length-1 || c== heights[0].length-1) ocean[1] = true;

        int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0,-1};

        for(int i=0;i<4;i++){
            int nr = r+dr[i];
            int nc = c+dc[i];

            if(nr>=0 && nr<heights.length && nc>=0 && nc< heights[0].length
            && !visited[nr][nc] && heights[nr][nc]<=heights[r][c]){
                 dfs(nr, nc, heights, visited, ocean);
            }
        }


    }
        // List<List<Integer>> res = new ArrayList<>();
        // HashSet<int[]> setPacific = new HashSet<>();
        // HashSet<int[]> setAtlantic = new HashSet<>();


        // int[][] visited = new int[n][m];

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         if(i==0 || j ==0){
        //             setPacific.add(new int[]{i,j});
                

        //         }
        //         else if(i==n || j ==m){
        //             setAtlantic.add(new int[]{i,j});

        //         }
        //     }
        // }


        // int[] dr = {-1,0,1,0};
        // int[] dc = {0,1,0,-1};

       

        
    
}
