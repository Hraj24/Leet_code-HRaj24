class Solution {
    public int[] twoSum(int[] nums, int target) {
        //BRUTE FORCE APPROACH

          for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                int sum = nums[i]+nums[j];
                if(sum==target){
                    return new int[]{i,j};
                }
            }
        
        }
        return new int[] { };


        //OPTIMAL APPROACH

        
        // Arrays.sort(nums);
        // int n=nums.length;
        // int left=0;
        // int right=n-1;
        // int[] ans=new int[2];

        // while(left<right){
        //     int sum=nums[left]+nums[right];
        //     if(sum==target){
        //         ans[0]=left;
        //         ans[1]=right;
        //         return ans;
        //     }else if(sum<target){
        //         left++;
        //     }else{
        //         right--;
        //     }
        // }
        // return ans;
    }
}