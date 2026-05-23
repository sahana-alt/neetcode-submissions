class Solution {
    func isPalindrome(_ s: String) -> Bool {


        let arr = Array(s.lowercased())
        var i = 0
        var j = s.count-1

        // if s.count < 2{
        //     return true
        // }

        

        while i < j {
            
            while i<j && !arr[i].isNumber && !arr[i].isLetter{
                i+=1
            }
            
            while i<j && !arr[j].isNumber && !arr[j].isLetter{
                j-=1
            }
            if arr[i] != arr[j]{
                return false
            }
            i += 1
            j -= 1
        }

        return true

    }
}
