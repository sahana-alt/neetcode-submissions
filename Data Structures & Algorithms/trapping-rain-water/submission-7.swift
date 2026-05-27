class Solution {
    func trap(_ height: [Int]) -> Int {

        let n = height.count

        var prefix:[Int] = Array(repeating: 0, count: n)
        var suffix: [Int] = Array(repeating: 0, count: n)


        prefix[0] = height[0]

        suffix[n-1] = height[n-1]

        for i in 1 ..< n {
            prefix[i] = max(height[i], prefix[i-1])
        }

        for i in stride(from:n-2, through: 0, by: -1) {
            suffix[i] = max(height[i], suffix[i+1])
        }

       
        var total = 0
        var trapped = 0

        for i in 0..<n {
            trapped = abs(min(prefix[i],suffix[i]) - height[i])

            if trapped > 0 {
                total += trapped
            }
        }

        return total

    }
}
