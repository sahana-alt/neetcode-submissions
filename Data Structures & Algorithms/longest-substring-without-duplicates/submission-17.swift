class Solution {
    func lengthOfLongestSubstring(_ s: String) -> Int {

        var chars = Array(s)
        var l = 0
        var n = chars.count
        var maxi = 0


        var set = Set<Character>()

        for r in 0..<chars.count{
            while set.contains(chars[r]){
                set.remove(chars[l])    //shrinking window on left 
                                        //to move right

                l+=1
            }

            set.insert(chars[r])
            maxi = max(r-l+1,maxi)
        }

        return maxi




    }
}
