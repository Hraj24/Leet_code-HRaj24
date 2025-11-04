class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int dp[]=new int[n];


        //return Math.min(solveRecursive(n-1,cost),solveRecursive(n-2,cost));
        //return Math.min(solveMemoization(n-1,cost,dp),solveMemoization(n-2,cost,dp));
       


//Dynamic programming(Tabulation)
	    for (int i=0; i<n; i++) {
		    if (i<2){
                dp[i] = cost[i];
            } 
		    else{
                dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
            }
	    }
	    return Math.min(dp[n-1], dp[n-2]);

        
    }
    //Recursive
    static int solveRecursive(int index,int[] cost){
        if(index<0){
            return 0;
        } 
        if(index==0 || index==1){
            return cost[index];
        }
        return cost[index]+Math.min(solveRecursive(index-1,cost),solveRecursive(index-2,cost));
    }


    //Dynamic Programming(Memoization)
    static int solveMemoization(int index,int[] cost,int[] dp){
       if(index<0){
            return 0;
        } 
        if(index==0 || index==1){
            return cost[index];
        }
        if(dp[index]!= 0){
            return dp[index];
        }
        dp[index]=cost[index]+Math.min(solveMemoization(index-1,cost,dp),solveMemoization(index-2,cost,dp));
        return dp[index];
    }
}