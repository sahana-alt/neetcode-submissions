class Solution {

    func encode(_ strs: [String]) -> String {

        var res:String = ""

        for str in strs{
            res.append("\(str.count)#\(str)")
           
          
        }

        return res
    }

    func decode(_ str: String) -> [String] {

        let chars = Array(str)

        var i = 0
        var res:[String] = []

        while i < str.count{
            var j = i

            while chars[j] != "#"{
                j+=1
            }

            guard let len = Int(String(chars[i..<j])) else {
            return []
            }


            let start = j + 1
            let end = start + len

            let string = String(chars[start..<end])
            res.append(string)



            i = end


        }




        return res

    }
}
