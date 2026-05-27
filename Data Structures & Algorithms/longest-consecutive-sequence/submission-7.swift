class Solution {
    func longestConsecutive(_ nums: [Int]) -> Int {
    let set = Set(nums)
    var maxLen = 0

    for num in set {
        if !set.contains(num - 1) {
            var current = num
            var len = 1

            while set.contains(current + 1) {
                current += 1
                len += 1
            }

            maxLen = max(maxLen, len)
        }
    }

    return maxLen
}
}
