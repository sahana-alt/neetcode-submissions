class Pair{
    int r, c, t;

    Pair(int r, int c, int t){
        this.r = r;
        this.c = c;
        this.t = t;

    }
}

class Solution {


    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int [][] visited = new int[n][m];

        Queue<Pair> q = new LinkedList<>();
        int freshCnt = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 2){
                    visited[i][j] = 2;
                    q.add(new Pair(i,j,0));

                }else{
                    visited[i][j] = 0;
                    if(grid[i][j] == 1){
                            freshCnt++;
                    }
                }
            }
        }

        int t = 0;
        int cnt = 0;
        int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0,-1};

        while(!q.isEmpty()){
            Pair curr = q.poll();
            int row = curr.r;
            int col = curr.c;
            int time = curr.t;

            t = Math.max(t,time);

            for(int k =0;k<4;k++){
                int nr = row+dr[k];
                int nc = col+dc[k];
                

                if(nr>=0 && nr<n && nc>=0 && nc<m && visited[nr][nc]!=2
                && grid[nr][nc]== 1){
                    q.add(new Pair(nr,nc, time+1));
                    visited[nr][nc] = 2;
                    cnt++;
                    
                }
            }

            

        }
        
    System.out.println("Count"+cnt+" FreshCnt"+freshCnt);
    if(cnt!=freshCnt) return -1;

    return t;

    }
}
