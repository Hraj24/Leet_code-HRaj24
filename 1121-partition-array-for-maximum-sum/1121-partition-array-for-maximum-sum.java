class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] memo = new int[n];
        java.util.Arrays.fill(memo, -1);

        return helper(arr, k, 0, memo);
    }
    private int helper(int[] arr, int k, int start, int[] memo) {
        int n = arr.length;

        if (start == n) return 0;
        if (memo[start] != -1) return memo[start];

        int maxSum = 0;    
        int maxElem = 0;   

        for (int length = 1; length <= k && start + length <= n; length++) {
            maxElem = Math.max(maxElem, arr[start + length - 1]);
            int currentSum = maxElem * length + helper(arr, k, start + length, memo);
            maxSum = Math.max(maxSum, currentSum);
        }
        return memo[start] = maxSum;
    }
}