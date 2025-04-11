class Solution {
    public int findClosestNumber(int[] nums) {
        int small =nums[0];
        int act=0;

        for(int num:nums){
            if(Math.abs(num)<Math.abs(small)){
                small=Math.abs(num);
                act=num;
            }else if(Math.abs(num)==Math.abs(small)){
                small=Math.max(num,small);
                act=small;
            }
        }
        return act;
    }
}