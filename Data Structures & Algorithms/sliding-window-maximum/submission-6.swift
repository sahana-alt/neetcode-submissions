class Solution {
    func maxSlidingWindow(_ nums: [Int], _ k: Int) -> [Int] {

        let n = nums.count

        var res:[Int] = []


        for i in 0...n-k {

           
            var maxi = Int.min
            for j in i ..< k+i {

                // print("\(maxi) + \(nums[i])")

                maxi = max(nums[j],maxi)

            }

            res.append(maxi)

        }

        return res

    }
}
