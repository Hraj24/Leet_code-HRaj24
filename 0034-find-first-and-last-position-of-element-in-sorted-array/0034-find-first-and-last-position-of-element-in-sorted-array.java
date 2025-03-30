class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        int l = 0, r = n - 1, s = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                s = mid;
                r = mid - 1;
            } 
            else if (nums[mid] < target) {
                l = mid + 1;
            } 
            else {
                r = mid - 1;
            }
        }
        l = 0; r = n - 1;
        int e = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                e = mid;
                l = mid + 1;
            } 
            else if (nums[mid] < target) {
                l = mid + 1;
            } 
            else {
                r = mid - 1;
            }
        }
        ans[0] = s;
        ans[1] = e;
        return ans;
    }
}