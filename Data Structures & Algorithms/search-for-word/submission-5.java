class Solution {
    boolean [][] visited;
    public boolean exist(char[][] board, String word) {
        int r = board.length;
        int c = board[0].length;
        visited = new boolean[r][c];
       

        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                if(dfs(i,j,0,board,word)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int r, int c, int index,char[][] board, String word){

        // if(index == word.length()){
        //     return true; // all chars match;
        // }

        // if(r<0 || c<0 || r>=board.length || c>= board[0].length || visited[r][c]||
        // word.charAt(index)!= board[r][c]){
        //     return false;   //bpoundary condtnn
        // }

        // visited[r][c] = true;

        // //all for dirs
        // boolean res = dfs(r-1,c,index+1,board,word) || dfs(r,c+1,index+1,board,word)
        // || dfs(r,c-1,index+1,board,word) || dfs(r+1,c,index+1,board,word);

        // visited[r][c] = false;

        // return res;

        if(index == word.length()){
            return true;
        }

        if(r<0 || c<0 || r>=board.length || c>=board[0].length || board[r][c]!=word.charAt(index)
        || visited[r][c]){
            return false;
        }

        visited[r][c] = true;

        boolean res = dfs(r-1,c,index+1,board,word)|| dfs(r,c+1,index+1,board,word)||
        dfs(r+1,c,index+1,board,word)|| dfs(r,c-1,index+1,board,word);

        visited[r][c] = false;

        return res;



    }
}
