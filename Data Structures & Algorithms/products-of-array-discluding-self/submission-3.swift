class Solution {
    func productExceptSelf(_ nums: [Int]) -> [Int] {

        var product = 1
        var zeroCount = 0

        for i in 0..<nums.count{
            if nums[i] == 0 { 
                zeroCount += 1
            }else{
                product = product * nums[i]
            }

        }

        var result: [Int] = []
        
        for num in nums{
           

            if zeroCount > 1{
                result.append(0)

            } else if zeroCount == 1{
                result.append(num == 0 ? product : 0)
            }else{
                result.append(product/num)
            }   
           
           
        }

        return result



    }
}
