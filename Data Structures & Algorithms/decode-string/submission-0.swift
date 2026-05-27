class Solution {
    func decodeString(_ s: String) -> String {

        let n = s.count

        var st: [Character] = []

        if n == 0 {
            return " "
        }

        let chars = Array(s)

        for ch in chars{

            if ch != "]" {
                st.append(ch)
            } else{

            var str = ""

           while let last = st.last, last != "[" {
                str = String(st.removeLast()) + str

            }

            st.removeLast() //remove the [

            //now getting len

            var numStr = ""

            while let last = st.last, last.isNumber {
                numStr = String(st.removeLast()) + numStr

            }

            let res = String(repeating:str, count: Int(numStr) ?? 0)

           

            for letter in res {
                st.append(letter)
            }

            }

        }


        return String(st)

        



    }
}
