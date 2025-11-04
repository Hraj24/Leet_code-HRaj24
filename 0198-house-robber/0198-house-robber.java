class Solution {
    public int rob(int[] nums) {
        //int n=nums.length-1;

//Basic Brute Force(not comply with all test case)
        // int firstSum=0;
        // int secondSum=0;
        // for(int i=0;i<nums.length;i++){
        //     if(i%2==0){
        //         firstSum+=nums[i];
        //     }else{
        //         secondSum+=nums[i];
        //     }
        // }
        // return Math.max(firstSum,secondSum);



//Dynamic Programming (Tabulation)
        // int n=nums.length;
        // if(n==0){
        //     return 0;
        // }
        // if(n==1){
        //     return nums[0];
        // }
        // int[] dp=new int[n+1];
        // dp[0]=nums[0];
        // dp[1]=Math.max(nums[0],nums[1]);
        // for(int i=2;i<n;i++){
        //     dp[i]=Math.max(dp[i-1],nums[i]+dp[i-2]);
        // }
        // return dp[n-1];






//More optimised Dynamic Programming with O(1) Space Complexity
        int n = nums.length;
        if (n == 1){
            return nums[0];
        }

        int prev1 = 0, prev2 = 0;
        for (int num : nums) {
            int temp = prev1;
            prev1 = Math.max(prev2 + num, prev1);
            prev2 = temp;
        }
        return prev1;


        // int dp[]=new int[n+1];
        // Arrays.fill(dp,-1);
        // return robbMemoization(n,dp,nums);

    }

//Recursive Approach
    static int robb(int[] nums, int i) {
        if (i < 0) {
            return 0;
        }
        if (i == 0) {
            return nums[0];
        }
        int skip = robb(nums, i - 1);
        int rob_it = nums[i] + robb(nums, i - 2);

        return Math.max(skip, rob_it);
    }




//Dynamic Programming (Memoization)
    static int robbMemoization(int n, int[] dp, int[] nums){
        if (n == 0){
            return nums[n];
        }
        if (n < 0){
            return 0;
        }
        if (dp[n] != -1){
            return dp[n];
        }

        int pick= nums[n] + robbMemoization(n-2, dp, nums);
        int notPick= robbMemoization(n-1, dp, nums);

        return dp[n]= Math.max(pick, notPick);
    }
}