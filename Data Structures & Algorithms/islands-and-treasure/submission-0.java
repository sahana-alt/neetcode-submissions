class Pair{
    int r,c;

    Pair(int r, int c){
        this.r = r;
        this.c = c;
        
    }
}

class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];
        Queue<Pair> q = new ArrayDeque<>();
        

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]== 0){
                   
                    q.add(new Pair(i,j));
                }
            }
        }
        
    

   
     
    int[] dr = {-1,0,1,0};
    int[] dc = {0,1,0,-1};
    

        while(!q.isEmpty()){
            Pair set = q.poll();
            int row = set.r;
            int col = set.c;
          
           



            for(int k=0;k<4;k++){
                int newr = row+dr[k];
                int newc = col+dc[k];

                if(newr>=0 && newr<n && newc>=0 && newc<m
                && grid[newr][newc]== Integer.MAX_VALUE ){
                   
                    q.add(new Pair(newr,newc));
                     

                    grid[newr][newc] = grid[row][col] + 1;
            


                }
           
                
            }
           
           
        }
    
    
}
}


