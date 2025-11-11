class Solution {
    public int findTargetSumWays(int[] nums, int target) {


// Tabulation
        // int totalSum = 0;
        // for(int num : nums){
        //     totalSum += num;
        // }
        // if((totalSum + target)%2 != 0 || totalSum < Math.abs(target)){
        //     return 0;
        // }
        // int newTarget = (totalSum + target) / 2;
        // int[] dp = new int[newTarget + 1];
        // dp[0] = 1;
        // for(int num : nums){
        //     for(int i = newTarget; i>= num; i--){
        //         dp[i] += dp[i-num];
        //     }
        // }
        // return dp[newTarget];










//Memoization
        int sum =0;
        for(int k:nums){
            sum += k;
        }
        if (target > sum || target < -sum) return 0;
        
        int dp [][] = new int [nums.length][(sum+1)*2];
        for(int [] arr : dp){
            Arrays.fill(arr,-1);
        }
        return helper(0,nums,sum,target,dp,0);

    }

    private static int helper(int idx,int [] nums,int sum,int target,int[][]dp,int curSum){
        if(idx == nums.length){
            if(curSum == target){
                return 1;
            }
            else{
                return 0;
            }
        }   

        if(dp[idx][sum+curSum] != -1  ) return dp[idx][sum+curSum];

        int pos =  helper(idx+1,nums,sum,target,dp,curSum+nums[idx]);
        int neg =  helper(idx+1,nums,sum,target,dp,curSum-nums[idx]);

        dp[idx][sum+curSum] = pos+neg;

        return dp[idx][sum+curSum];
    }
}