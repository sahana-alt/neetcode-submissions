class Solution {
    public int climbStairs(int n) {

        // return dfs(n);
        //  if (n <= 2) return n;
        //  //   DP Array (Memoization / Tabulation)
        //  int[] dp = new int[n + 1];

        // dp[1] = 1;
        // dp[2] = 2;

        // for (int i = 3; i <= n; i++) {
        //     dp[i] = dp[i - 1] + dp[i - 2];
        // }

        // return dp[n];

//optimal
        int oneStepBefore = 2;
        int twoStepsBefore = 1;

        for (int i = 3; i <= n; i++) {

            int current = oneStepBefore + twoStepsBefore;

            twoStepsBefore = oneStepBefore;
            oneStepBefore = current;
        }

        return n==1? 1: oneStepBefore;

        
        
    }
    // private int dfs(int n) {

    //     // exactly reached top
    //     if (n == 0) return 1;

    //     // exceeded top
    //     if (n < 0) return 0;

    //     // try 1-step and 2-step
    //     return dfs(n - 1) + dfs(n - 2);
    // }
}
