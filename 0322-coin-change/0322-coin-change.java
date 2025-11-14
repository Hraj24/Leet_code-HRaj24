class Solution {
    public int coinChange(int[] coins, int amount) {
//UnBounded KnapSack
//Recursive
        // if (amount < 0){
        //     return -1;
        // }
        // if (amount == 0){
        //     return 0;
        // }

        // int minCount = Integer.MAX_VALUE;

        // for (int coin : coins) {
        //     int res = coinChange(coins, amount - coin);
        //     if (res >= 0 && res < minCount) {
        //         minCount = 1 + res;
        //     }
        // }

        // return (minCount == Integer.MAX_VALUE) ? -1 : minCount;




//Tabulation
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        
        dp[0] = 0;
        
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }
        
        return dp[amount] > amount ? -1 : dp[amount];




//Memoization
    //     int[] dp = new int[amount + 1];
    //     Arrays.fill(dp, -2);
    //     return solve(coins, amount, dp);
    // }

    // private int solve(int[] coins, int n, int[] dp) {
    //     if (n < 0){
    //         return -1;
    //     }
    //     if (n == 0){
    //         return 0;
    //     }
    //     if (dp[n] != -2){
    //         return dp[n];
    //     }

    //     int minCount = Integer.MAX_VALUE;
    //     for (int coin : coins) {
    //         int res = solve(coins, n - coin, dp);
    //         if (res >= 0 && res < minCount) {
    //             minCount = 1 + res;
    //         }
    //     }
    //     dp[n] = (minCount == Integer.MAX_VALUE) ? -1 : minCount;
    //     return dp[n];
    }
}