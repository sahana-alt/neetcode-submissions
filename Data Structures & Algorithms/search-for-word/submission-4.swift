class Solution {
    func exist(_ board: [[Character]], _ word: String) -> Bool {

        let rows = board.count
        let cols = board[0].count

        let chars = Array(word)
        var visited:[[Bool]] = Array(repeating: Array(repeating:false, count:board[0].count), 
        count: board.count)

     

        for i in 0..<rows {
            for j in 0..<cols {

                if dfs(i,j,0,board, chars, &visited){
                    return true
                }
            }
        }

        return false

    }

    func dfs(_ i: Int, _ j: Int,_ index: Int,_ board: [[Character]], _ word: [Character], _ visited: inout [[Bool]]) -> Bool {

        if index == word.count {
            return true
        }

        if i < 0 || j<0 || i >= board.count || 
        j >= board[0].count || word[index] != board[i][j] || visited[i][j] {
            return false
        }

        visited[i][j] = true

        let res = dfs(i-1,j,index+1,board,word,&visited) || 
                    dfs(i,j+1, index+1,board,word,&visited) ||
                    dfs(i+1,j,index+1,board,word,&visited) ||
                    dfs(i,j-1,index+1,board,word,&visited)


        visited[i][j] = false
        return res


    }
}
