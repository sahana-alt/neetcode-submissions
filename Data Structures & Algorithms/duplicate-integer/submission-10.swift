class Solution {
    func hasDuplicate(_ nums: [Int]) -> Bool {
        let sortedNums = nums.sorted()

        if sortedNums.count < 2 {
            return false
        }

        for i in 0..<sortedNums.count-1{
            if sortedNums[i] == sortedNums[i+1]{
                return true
            }
        }

    return false
    }
}
