class Solution {
    public int climbStairs(int n) {


//Simple Fibonacci Pattern Using Iteration
        // if (n == 0 || n == 1) {
        //     return 1;
        // }
        // int prev = 1, curr = 1;
        // for (int i = 2; i <= n; i++) {
        //     int temp = curr;
        //     curr = prev + curr;
        //     prev = temp;
        // }
        // return curr;



//Simple Fibonacci Pattern Using Recursion
        // if(n==0){
        //     return 1;
        // }
        // if(n<0){
        //     return 0;
        // }

        // return climbStairs(n-1)+climbStairs(n-2);




//Dynamic Programming(Memoization)
        // if(n==0){
        //     return 1;
        // }
        // if(n<0){
        //     return 0;
        // }

        // if (ways[n] != -1) {
        //     return ways[n];
        // }
        // ways[n]=climbStairs(n-1,ways)+climbStairs(n-2,ways);
        // return ways[n];





//Dynamic Programming(Memoization)
        int []dp=new int[n+1];
        dp[0]=1;

        for(int i=1;i<=n;i++){
            if(i==1){
                dp[i]=dp[i-1];
            }else{
                dp[i]=dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }
}