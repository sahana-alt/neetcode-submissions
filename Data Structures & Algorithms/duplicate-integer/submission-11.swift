class Solution {
    func hasDuplicate(_ nums: [Int]) -> Bool {
    //     let sortedNums = nums.sorted()

    //     if sortedNums.count < 2 {
    //         return false
    //     }

    //     for i in 0..<sortedNums.count-1{
    //         if sortedNums[i] == sortedNums[i+1]{
    //             return true
    //         }
    //     }

    // return false

        var numsSize = nums.count

        var mp:[Int:Int] = [:]

        for i in 0..<numsSize{

            if mp[nums[i]] != nil{
                mp[nums[i]]!+=1
                var value = mp[nums[i]]
                
                if value! > 1 {
                    return true
                }

            }else{
                mp[nums[i]] = 1

            }
        }
        return false
    }
}
