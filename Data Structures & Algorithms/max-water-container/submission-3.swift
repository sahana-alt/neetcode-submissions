class Solution {
    func maxArea(_ heights: [Int]) -> Int {

        var leftMax = Int.min
        var rightMax = Int.min

        var l = 0
        var r = heights.count-1
        var maxArea = Int.min
        var area = 0

        

        while l < r {
            

            if heights[l] <= heights[r]{
                area = (r-l) * heights[l]
                rightMax = max(rightMax, heights[r])
                l+=1

            }else{
                area = (r-l) * heights[r]
                leftMax = max(leftMax, heights[l])
                r-=1
            }

            maxArea = max(area, maxArea)

            

        }

    return maxArea;

    }
}
