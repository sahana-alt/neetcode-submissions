class Solution {
    func twoSum(_ nums: [Int], _ target: Int) -> [Int] {
        var n = nums.count
        var mp:[Int:Int] = [:]

        for i in 0..<nums.count{
            var diff = target - nums[i]
            if mp.keys.contains(diff){
                if i != mp[diff]{
                    return [mp[diff]!, i];
                }
            }

            mp[nums[i]] = i

        }

        return []

    }
}
