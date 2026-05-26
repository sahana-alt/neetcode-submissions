class Solution {
    func coinChange(_ coins: [Int], _ amount: Int) -> Int {
        //we keep dp of amount

       
        
        if amount == 0 {
            return 0
        }

        var dp:[Int] = Array(repeating: amount + 1, count:amount+1)

        dp[0] = 0  

        for i in 1 ... amount{

            for coin in coins {


                // can i ise the coin
                if coin <= i {

                    // u pick already calculated number of coins or u pick 1 + remaining amount
                    // dp of amount - coin
                    dp[i] = min(dp[i], 1 + dp[i-coin])
                }
            }
        }


        return dp[amount] > amount  // not exact amount
            ? -1
            : dp[amount]

    }
}
