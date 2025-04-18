class Solution {
    public int majorityElement(int[] nums) {
      
        int n = nums.length;
        int count = 0; 
        int element = 0; 

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                element = nums[i];
            } else if (element == nums[i]){
                count++;
            } 
            else{
                count--;
            }
                
        }

        //checking if the stored element
        // is the majority element:
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == element){
                 count1++;
            }
        }

        if (count1 > (n / 2)){
            return element;
        } 


        return -1; 
    }
}