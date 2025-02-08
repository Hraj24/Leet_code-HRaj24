class Solution {
    public boolean search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(nums[mid]==target) return true;
// if left mid right all are same then it is difficult to determine sorted half
            if(nums[left]==nums[mid] && nums[mid]==nums[right])
            {
                left=left+1;            
                right=right-1;
                continue;
            }
// check if first half is sorted
            if(nums[left]<=nums[mid])
            {
                if(nums[left]<=target && target<=nums[mid]) right=mid-1;
                else left=left+1;
            }
            else
            {
                if(nums[mid]<=target && target<=nums[right]) left=mid+1;
                else  right=mid-1;
            }
        }
        return false;
    }
}