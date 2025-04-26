class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int min = -1, max = -1, bad = -1;
        long count = 0;
        
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == minK) min = i;
            if (nums[i] == maxK) max = i;
            if (nums[i] < minK || nums[i] > maxK) bad = i;
            if (min != -1 && max != -1) {
                count += Math.max(0, Math.min(min, max) - bad);
            }
        }
        return count;
    }
}