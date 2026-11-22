class Solution {
    public int minIncrementForUnique(int[] nums) {
        // int count=0;
        // Arrays.sort(nums);
        // int i=0;
        // while(i<nums.length-1){
        //     if(nums[i]>=nums[i+1]){
        //         nums[i+1]++;
        //         count++;
        //     }else{
        //         i++;
        //     }
        // }
        // return count;


        Arrays.sort(nums);
        int n = nums.length;
        int pre = nums[0];
        int index = 1;
        int inc = 0;
        while(index < n){
            if(nums[index] > pre){
                pre = nums[index];
            }else{
                inc += pre - nums[index] + 1;
                pre = pre + 1;
            }
            index++;
        }
        return inc;
    }
}