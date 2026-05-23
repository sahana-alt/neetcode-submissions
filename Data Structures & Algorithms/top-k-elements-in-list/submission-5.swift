class Solution {
    func topKFrequent(_ nums: [Int], _ k: Int) -> [Int] {


        var mp:[Int:Int] = [:]

        for i in 0..<nums.count{
            mp[nums[i], default:0]+=1
        }

        let sortedMap = mp.sorted{
            $0.value>$1.value
        }

        var result:[Int] = []
        var index = 0
        print(sortedMap)

    //     for item in sortedMap {

    //         index += 1
    //         result.append(item.key)

    //         if(index == k){
    //             break
    //         }
           
        
        
          
    //   }
    for i in 0..<k {
            result.append(sortedMap[i].key)
        }
    

        return result

    }
}
