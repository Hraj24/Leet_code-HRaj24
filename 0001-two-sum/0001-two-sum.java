class Solution {
    public int[] twoSum(int[] nums, int target) {
        //BRUTE FORCE APPROACH

        //   for(int i=0; i<nums.length-1; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         int sum = nums[i]+nums[j];
        //         if(sum==target){
        //             return new int[]{i,j};
        //         }
        //     }
        
        // }
        // return new int[] { };


        //OPTIMAL APPROACH

        
        //Arrays.sort(nums);
        // int n=nums.length;
        // int left=0;
        // int right=n-1;
        // int[] ans=new int[2];

        // while(left<right){
        //     int sum=nums[left]+nums[right];
            
        //     if(sum<target){
        //         left++;
        //     }else if(sum>target){
        //         right--;
        //     }else{
        //         ans[0]=left;
        //         ans[1]=right;
        //         return ans;
        //     }
        // }
        // return ans;



        //Optimal Approach
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{};
    }
}