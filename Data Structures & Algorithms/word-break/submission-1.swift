class Solution {
    func wordBreak(_ s: String, _ wordDict: [String]) -> Bool {

        let n = s.count

        

        let wordSet = Set(wordDict)

        let chars = Array(s)

        var dp: [Bool] = Array(repeating: false, count: s.count+1)

        dp[0] = true

        for i in 1...n {

            for j in 0...i {

                

                let word = String(chars[j..<i])
             

                if dp[j] == true && wordSet.contains(word) {
                    dp[i] = true
                    break
                }

            }
        }

        return dp[n]

        

    }
}
