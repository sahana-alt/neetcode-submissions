class Solution {
    func groupAnagrams(_ strs: [String]) -> [[String]] {

        var mp:[String:[String]] = [:]

        for str in strs{
            let key = String(str.sorted())
            
            if mp[key] != nil{
                mp[key]?.append(str)
            }else{
                mp[key] = [str]
            }
        }

        var result: [[String]] = []
        for arr in mp.values{
            result.append(arr)
        }

        return result

    }
}
