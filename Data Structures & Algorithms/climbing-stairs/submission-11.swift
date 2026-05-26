class Solution {
    func climbStairs(_ n: Int) -> Int {


        if n <= 2 {
            return n
        }

        // var dp : [Int] = Array(repeating:0,count:n+1)

        // dp[1] = 1
        // dp[2] = 2

        // for i in 3 ... n{
        //     dp[i] = dp[i-1] + dp[i-2]

        // }

       
        // return dp[n]

        var first = 1
        var second = 2
        
        for i in 3 ... n{
            let cur = first + second
            first = second
            second = cur

        }

        return second

    }
}
