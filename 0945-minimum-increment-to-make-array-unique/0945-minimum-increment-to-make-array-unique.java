class Solution {
    public int minIncrementForUnique(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length-1){
            if(nums[i]>=nums[i+1]){
                nums[i+1]++;
                count++;
            }else{
                i++;
            }
        }
        return count;
    }
}