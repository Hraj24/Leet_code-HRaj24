class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }
        int[] dp = new int[n - 1];
        int[] arr1 = new int[n - 1];
        int[] arr2 = new int[n - 1];
        
        for(int i = 0; i < n - 1; i++){
            arr1[i] = nums[i];
        }
        for(int i = 0; i < n - 1; i++){
            arr2[i] = nums[i + 1];
        }

        // Arrays.fill(dp, -1); 
        // int one = house(arr1, arr1.length - 1, dp);
        
        // Arrays.fill(dp, -1);
        // int two = house(arr2, arr2.length - 1, dp);
        
        // return Math.max(one, two);


        return Math.max(house(arr1), house(arr2));
    }


//Dynamic Programming(Memoization)
    static int house(int[] nums, int i, int[] dp){
        if(i < 0){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int take = nums[i] + house(nums, i - 2, dp);
        int notake = house(nums, i - 1, dp); 
        return dp[i] = Math.max(take, notake);
    }





    
//Dynamic Programming(Tabulation)

    private int house(int[] nums){
        if(nums.length == 1){
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i < nums.length; i++){
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[nums.length - 1];
    }
}