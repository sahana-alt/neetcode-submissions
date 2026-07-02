class Solution {
    public boolean isValidSudoku(char[][] board) {
        //  int row = (square / 3) * 3 + i;
        //             int col = (square % 3) * 3 + j;
        //             if (board[row][col] == '.') continue;
        //             if (seen.contains(board[row][col])) 


        for(int r =0;r<9;r++){
            Set<Character> st = new HashSet<>();

            for(int c =0;c<9;c++){

                if(board[r][c] == '.'){
                    continue;
                }

                if(!st.add(board[r][c])){
                    return false;
                }

            }
        }


       
        for(int c =0;c<9;c++){
            Set<Character> st = new HashSet<>();

            for(int r =0;r<9;r++){

                if(board[r][c] == '.'){
                    continue;
                }

                if(!st.add(board[r][c])){
                    return false;
                }

            }
        }


        for (int square = 0; square < 9; square++) {

            Set<Character> seen = new HashSet<>();

            for (int i = 0; i < 3; i++) {

                for (int j = 0; j < 3; j++) {

                    int row = (square / 3) * 3 + i;
                    int col = (square % 3) * 3 + j;

                    char ch = board[row][col];

                    if (ch == '.') continue;

                    if (seen.contains(ch)) return false;

                    seen.add(ch);
                }
            }
        }

        return true;

    }
}
