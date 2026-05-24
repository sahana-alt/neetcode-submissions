class Solution {
    func longestPalindrome(_ s: String) -> String {

        var start = 0
        var maxLen = 1  //every character is a palindrome
        let chars = Array(s)
        let n = s.count

        
        func expand(_ left: Int, _ right: Int){
            var l = left
            var r = right

            while l>=0 && r<n && chars[l] == chars[r]{
                
                let len = r-l+1

                if len > maxLen{
                    start = l
                    maxLen = len
                }
                l -= 1
                r += 1
            }


        }

        for i in 0..<s.count{
            expand(i,i)
            expand(i,i+1)
        }

        return String(chars[start..<start+maxLen])


    }
}
