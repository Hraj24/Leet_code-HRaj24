class Solution {
    public int jump(int[] nums) {
        int jump=0;
        int position=0;
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            jump=Math.max(jump,i+nums[i]);
            if(i==position){
                count++;
                position=jump;
            }
            
        }
        return count;
    }
}