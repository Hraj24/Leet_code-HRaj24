class Solution {
    public int majorityElement(int[] nums) {


    // O(n)
        int n = nums.length;
        int count = 0; 
        int element = 0; 

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                element = nums[i];
            }
            if (element == nums[i]){
                count++;
            } 
            else{
                count--;
            }
                
        }
        return element;
    }


//O(n*logn)
    // Arrays.sort(nums);
    // int freq=1;
    // int ans=nums[0];
    // for(int i=1;i<nums.length;i++){
    //     if(nums[i]==nums[i-1]){
    //         freq++;
    //     }else{
    //         freq=1;
    //         ans=nums[i];
    //     }


    //     if(freq>(nums.length/2)){
    //         return ans;
    //     }
    // }
    // return ans;
    // }
}