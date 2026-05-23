class Solution {
    func maxProfit(_ prices: [Int]) -> Int {

        var n = prices.count 
        var profit = 0
        var maxProfit = 0

        for i in 0..<n-1{
            for j in i+1..<n{

                if(prices[j]>prices[i]){
                    profit = prices[j] - prices[i]
                    maxProfit = max(profit, maxProfit)
                }

            }
        }

        return maxProfit

    }
}
