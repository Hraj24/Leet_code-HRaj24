class Solution {
    public int[] rearrangeArray(int[] nums) {
        int posnum=0;
        int negnum=1;
        int [] ans= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[posnum]=nums[i];
                posnum+=2;
            }else{
                ans[negnum]=nums[i];
                negnum+=2;
            }
        }
        return ans;
        
    }
}