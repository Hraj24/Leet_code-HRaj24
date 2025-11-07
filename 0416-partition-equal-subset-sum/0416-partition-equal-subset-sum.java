class Solution {
    public boolean canPartition(int[] nums) {

//Dynamic Programming(TABULATION)   
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        int targetSum=sum/2;

        boolean dp[]=new boolean[targetSum+1];
        dp[0]=true;

        for(int i=1;i<n;i++){
            for(int j=targetSum;j>=nums[i];--j){
                dp[j]=dp[j]||dp[j-nums[i]];
                if(dp[targetSum]){
                    return true;
                }
            }
        }
        return dp[targetSum];


//Dynamic Programming(MEMOIZATION)
        
    }
}