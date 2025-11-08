class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        // int n=nums.length;
        // int sum=0;
        // for(int i=0;i<n;i++){
        //     sum+=nums[i];
        // }
        // if(sum%k!=0){
        //     return false;
        // }
        // int targetSum=sum/k;

        // boolean dp[]=new boolean[targetSum+1];
        // dp[0]=true;

        // for(int i=1;i<n;i++){
        //     for(int j=targetSum;j>=nums[i];--j){
        //         dp[j]=dp[j]||dp[j-nums[i]];
        //         if(dp[targetSum]){
        //             return true;
        //         }
        //     }
        // }
        // return dp[targetSum];








        int n = nums.length;
        int S = Arrays.stream(nums).sum();
        if (S % k != 0) return false;
        int T = S / k;
        
        Arrays.sort(nums);
        for (int i = 0, j = n-1; i < j; i++, j--) {
            int tmp = nums[i]; nums[i] = nums[j]; nums[j] = tmp;
        }
        if (nums[0] > T) return false;

        int N = 1 << n;
        int[] dp = new int[N];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        for (int mask = 0; mask < N; mask++) {
            if (dp[mask] < 0) continue;       // unreachable subset
            for (int i = 0; i < n; i++) {
                if (((mask >> i) & 1) == 0) {
                    int s = dp[mask] + nums[i];
                    if (s <= T) {
                        dp[mask | (1 << i)] = s % T;
                    }
                }
            }
        }

        return dp[N-1] == 0;
    }
}