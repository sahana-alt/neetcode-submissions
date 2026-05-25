class Solution {
    func numIslands(_ grid: [[Character]]) -> Int {

       
        let cols = grid[0].count
        let rows = grid.count
        var c = 0
        //imp
        var visited: [[Bool]] = Array(repeating: Array(repeating: false, count: cols), count:rows )

       
        for i in 0..<rows {
            
            for j in 0..<cols {
                

                if grid[i][j] == "1" && !visited[i][j]{
                    
                    bfs(i,j,grid, &visited)
                    c += 1
                }
            }
        }

        return c

    }

    func bfs(_ r: Int, _ c: Int, _ grid: [[Character]], _ visited: inout [[Bool]]){

        visited[r][c] = true

        var q:[[Int]] = []

        q.append([r,c])

        let d1 = [-1,0,1,0]
        let d2 = [0,1,0,-1]

        while !q.isEmpty {

            let array = q.removeFirst()

            
            for k in 0..<4{
                let nr = array[0] + d1[k]
                let nc = array[1] + d2[k]

                //imp con
                if nr >= 0 &&
                   nr < grid.count &&
                   nc >= 0 &&
                   nc < grid[0].count && 
                   grid[nr][nc] == "1" 
                   && !visited[nr][nc]{

                    visited[nr][nc] = true //imp
                    q.append([nr,nc])
                }

            }
            
        }
    }
}
