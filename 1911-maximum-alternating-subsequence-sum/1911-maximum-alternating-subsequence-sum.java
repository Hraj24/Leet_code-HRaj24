class Solution {
    int n;
    long [][]dp;
    public long maxAlternatingSum(int[] nums) {
        n=nums.length;
        dp=new long[1000001][2];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(0,nums,1);
    }
    public long solve(int index,int []nums,int flag){
        if(index>=n){
            return 0;
        }
        if(dp[index][flag]!=-1){
            return dp[index][flag];
        }
        long skip=solve(index+1,nums,flag);
        long val=nums[index];
        if(flag==0){
            val=-val;
        }
        long take=solve(index+1,nums,1-flag)+val;

        return dp[index][flag]=Math.max(skip,take);
    }
}