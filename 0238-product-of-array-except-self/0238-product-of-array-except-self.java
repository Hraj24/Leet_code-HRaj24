class Solution {
    public int[] productExceptSelf(int[] nums) {

        //Brute Force  Approach
        // int ans[]=new int[nums.length];
        // for (int i = 0; i < nums.length; i++) {
        //     ans[i] = 1;
        // }
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums.length;j++){
        //         if(i!=j){
        //             ans[i]*=nums[j];
        //         }
        //     }
        // }
        // return ans;





        // Optimal Approach(Time Optimization)
        // int n=nums.length;
        // int ans[]=new int[n];
        // int prefix[]=new int[n];
        // for (int i = 0; i < nums.length; i++) {
        //     prefix[i] = 1;
        // }
        // for (int i = 1; i < nums.length; i++) {
        //     prefix[i] = prefix[i-1]*nums[i-1];
        // }
        // int suffix[]=new int[n];
        // for (int i = 0; i < nums.length; i++) {
        //     suffix[i] = 1;
        // }
        // for (int i = n-2; i >= 0; i--) {
        //     suffix[i] = suffix[i+1]*nums[i+1];
        // }

        // for (int i = 0; i < ans.length; i++) {
        //     ans[i]=suffix[i]*prefix[i];
        // }
        // return ans;





        //Optimal Approach(Time Space Both Optimised)
        int n=nums.length;
        int ans[]=new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            ans[i] =ans[i-1]*nums[i-1] ;
        }
        int suffix=1;
        for (int i = n-2; i>=0; i--) {
            suffix*=nums[i+1];
            ans[i]*=suffix;
        }

        return ans;
    }
}