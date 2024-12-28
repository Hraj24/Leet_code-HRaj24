class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int i = 0;
        while(i<n){
            if(nums[i] != i){
                return i;
            }
            i++;
        }
        return n;
    }
}