class Solution {
    public void sortColors(int[] nums) {
        // int count0=0;
        // int count1=0;
        // int count2=0;
        // for(int i:nums){
        //     if(i==0){
        //         count0++;
        //     }
        //     else if(i==1){
        //         count1++;
        //     }
        //     else{
        //         count2++;
        //     }
        // }
        // int num=0;
        // for(int i=0;i<count0;i++){
        //     nums[num++]=0;
        // }
        // for(int i=0;i<count1;i++){
        //     nums[num++]=1;
        // }
        // for(int i=0;i<count2;i++){
        //     nums[num++]=2;
        // }   





        //Optimal
        int mid=0;
        int low=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==2){
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;

                high--;
            }else if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;

                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }
        }
    }
}