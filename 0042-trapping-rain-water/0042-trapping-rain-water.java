class Solution {
    public int trap(int[] height) {
        int trappedWater=0;
        int n = height.length;


//Better Approach.
        // if (height == null || height.length == 0) {
        //     return 0;
        // }
        // int[] leftMax = new int[n];
        // int[] rightMax = new int[n];

        // leftMax[0] = height[0];
        // for (int i = 1; i < n; i++) {
        //     leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        // }
        // rightMax[n - 1] = height[n - 1];
        // for (int i = n - 2; i >= 0; i--) {
        //     rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        // }

        // for (int i = 0; i < n; i++) {
        //     trappedWater += Math.min(leftMax[i], rightMax[i]) - height[i];
        // }
        // return trappedWater;



//Optimal Approach
        //Using Two Pointer
        int left=0;
        int right=n-1;
        int lmax=0;
        int rmax=0;

        while(left<right){
            lmax=Math.max(lmax,height[left]);
            rmax=Math.max(rmax,height[right]);

            if(lmax<rmax){
                trappedWater += lmax-height[left];
                left++;
            }else{
                trappedWater += rmax-height[right];
                right--;
            }
        }
        return trappedWater;
    }
}