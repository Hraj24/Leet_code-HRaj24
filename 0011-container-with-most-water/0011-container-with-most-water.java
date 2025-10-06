class Solution {
    public int maxArea(int[] height) {
        //Brute Force Approach
        // int maxWater=0;
        // for(int i=0;i<height.length;i++){
        //     for(int j=i+1;j<height.length;j++){
        //         int weidth=j-i;
        //         int hgt=Math.min(height[j],height[i]);
        //         int area=weidth*hgt;
        //         maxWater=Math.max(maxWater,area);
        //     }
           
        // }
        //  return maxWater;



        //Optimal Approach
        int maxWater=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int wt=right-left;
            int ht=Math.min(height[left],height[right]);
            int area=wt*ht;
            maxWater=Math.max(maxWater,area);

            // (height[left]<height[right])? left++:right--;
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
    }
}