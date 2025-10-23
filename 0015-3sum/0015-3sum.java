class Solution {
    public List<List<Integer>> threeSum(int[] nums) {


//Brute Force Using Sorting And HashSet in O(n^3)
        // int n=nums.length;
        // //List<List<Integer>> ans=new ArrayList<>();
        // Set<List<Integer>> ans=new HashSet<>();

        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         for(int k=j+1;k<n;k++){
        //             if(nums[i]+nums[j]+nums[k]==0){
        //                 List<Integer> triplet= Arrays.asList(nums[i],nums[j],nums[k]);
        //                 Collections.sort(triplet);

        //                 ans.add(triplet);
        //             }
        //         }
        //     }
        // }


        // return new ArrayList(ans);



//Better Approach

        // int n=nums.length;
        // Set<List<Integer>> uniqueTriplets=new HashSet<>();

        // for(int i=0;i<n;i++){
        //     int target=-nums[i];
        //     Set<Integer> s=new HashSet<>();
        //     for(int j=i+1;j<n;j++){
        //         int third=target-nums[j];
        //         if(s.contains(third)){
        //             List<Integer> triplet= Arrays.asList(nums[i],nums[j],third);
        //             Collections.sort(triplet);

        //             uniqueTriplets.add(triplet);
        //         }
        //         s.add(nums[j]);
        //     }
        // }


        // return new ArrayList(uniqueTriplets);

// Optimised Approach
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=n-1;

            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }else if(sum > 0){
                    k--;
                }else{
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                }
            }
        }
        return ans;
        
    }
}