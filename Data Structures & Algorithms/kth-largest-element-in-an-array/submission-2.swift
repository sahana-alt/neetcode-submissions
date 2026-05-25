class Solution {
    func findKthLargest(_ nums: [Int], _ k: Int) -> Int {

        let sortedNums = nums.sorted{
            $0>$1
        }

   

        return sortedNums[k-1]

    }
}
