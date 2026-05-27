class Solution {
    func longestCommonSubsequence(_ text1: String, _ text2: String) -> Int {

        let arr1 = Array(text1)
        let arr2 = Array(text2)

        var dp = Array(repeating:Array(repeating:0, count:arr2.count+1), count: arr1.count+1)

        var ans = 0


        for i in 1 ... arr1.count {
            for j in 1 ... arr2.count {

                if arr1[i-1] == arr2[j-1] {

                    dp[i][j] = dp[i-1][j-1] + 1
                    ans = max(dp[i][j], ans)

                } else {
                    dp[i][j] = max(
                        dp[i - 1][j], // skip text1 char
                        dp[i][j - 1]  // skip text2 char
                    )
                }

            }

        }

        return dp[arr1.count][arr2.count]

    }
}
