class Solution {
    func productExceptSelf(_ nums: [Int]) -> [Int] {

        // var product = 1
        // var zeroCount = 0

        // for i in 0..<nums.count{
        //     if nums[i] == 0 { 
        //         zeroCount += 1
        //     }else{
        //         product = product * nums[i]
        //     }

        // }

        // var result: [Int] = []
        
        // for num in nums{
           

        //     if zeroCount > 1{
        //         result.append(0)

        //     } else if zeroCount == 1{
        //         result.append(num == 0 ? product : 0)
        //     }else{
        //         result.append(product/num)
        //     }   
           
           
        // }

        // return result

        if nums.count < 2{
            return nums
        }


        var prefix: [Int] = Array(repeating: 1, count: nums.count)
        var suffix: [Int] = Array(repeating: 1, count: nums.count)

        prefix[0] = 1

        for i in 1..<nums.count{
            prefix[i] = nums[i-1] * prefix[i-1]
        }

        suffix[nums.count-1] = 1

        for i in stride(from: nums.count-2, through: 0, by: -1) {
            suffix[i] = nums[i+1] * suffix[i+1]
        }

        var result: [Int] = Array(repeating: 1, count: nums.count)

         for i in 0..<nums.count {
            result[i] = prefix[i] * suffix[i]
        }
        

        return result


    }
}
