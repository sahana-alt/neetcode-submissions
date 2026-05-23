class Solution {
    func isAnagram(_ s: String, _ t: String) -> Bool {

        // var set1 = Set<Character>()
        // var set2 = Set<Character>()

        // if s.count != t.count {
        //     return false
        // }

        // for i in s{
        //     set1.insert(i)
        // }

        // for j in t{
        //     set2.insert(j)
        // }

        // return set1 == set2


        if s.count != t.count {
            return false
        }

        var dict1:[Character:Int] = [:]
        var dict2:[Character:Int] = [:]

        for i in s{   
            if let count = dict1[i]{
                dict1[i] = count + 1
            } else{
                dict1[i] = 1
            }            
        }

        for j in t{   
            if let count = dict2[j]{
                dict2[j] = count + 1
            } else{
                dict2[j] = 1
            }            
        }
        return dict1 == dict2
        
        
    }
}
