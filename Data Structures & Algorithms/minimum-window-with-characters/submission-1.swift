class Solution {
    func minWindow(_ s: String, _ t: String) -> String {

        var needDict:[Character: Int] = [:]

        let arr1 = Array(s)
        let arr2 = Array(t)

        for i in 0..<arr2.count{
            needDict[arr2[i], default: 0] += 1
        }

        let required = needDict.keys.count


        var l = 0
        var r = 0
        var formed = 0
        var len = Int.max
        var start = 0

        var windowDict:[Character:Int] = [:]

        while r < arr1.count{

            let ch = arr1[r]
            windowDict[ch, default: 0] += 1

            if let needed = needDict[ch],
            windowDict[ch] == needed {
                formed += 1
            }

            
            while required == formed {

                

                let windowLen = r - l + 1

                if windowLen < len {
                    len = windowLen
                    start = l
                }

                let chl = arr1[l]

                windowDict[chl, default: 0] -= 1

                if let neededCount = needDict[chl],
                    windowDict[chl, default: 0] < neededCount {
                        formed -= 1
                    }

                l += 1

            }
            r += 1
        }

        

        if len == Int.max {
            return ""
        }

        return String(arr1[start..<start + len])

    }
}
