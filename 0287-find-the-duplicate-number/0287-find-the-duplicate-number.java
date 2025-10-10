class Solution {
    public int findDuplicate(int[] nums) {
        // int len = nums.length;
        // for (int num : nums) {
        //     int next = Math.abs(num);
        //     if (nums[next] < 0) {
        //         return next;
        //     }
        //     nums[next] = -nums[next];
        // }

        // return len;


//Using HashSet(Taking Extra Space (O(N)-> Space & O(N)-> Time))
        // Set<Integer> s=new HashSet<>();
        // for(int num:nums){
        //     if(s.contains(num)){
        //         return num;
        //     }
        //     s.add(num);
        // }
        // return 0;



//Using Two Pointer(Fast & Slow Pointer)

        int slow=nums[0];
        int fast=nums[0];

        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);


        slow=nums[0];

        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }

        return slow;
    }
}