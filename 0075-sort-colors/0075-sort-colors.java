class Solution {
    public void sortColors(int[] nums) {
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i:nums){
            if(i==0){
                count0++;
            }
            else if(i==1){
                count1++;
            }
            else{
                count2++;
            }
        }
        int num=0;
        for(int i=0;i<count0;i++){
            nums[num++]=0;
        }
        for(int i=0;i<count1;i++){
            nums[num++]=1;
        }
        for(int i=0;i<count2;i++){
            nums[num++]=2;
        }   
    }
}