class Solution {
    public int subarraySum(int[] nums, int k) {


//Brute Force Approach
        // int n = nums.length; 
        // int cnt = 0; 

        // for (int i = 0 ; i < n; i++) { 
        //     int sum = 0;
        //     for (int j = i; j < n; j++) { 
                
        //         sum += nums[j];
        //         if (sum == k)
        //             cnt++;
        //     }
        // }
        // return cnt;



//Optimised Approach
        //Using Prefix Sum and HashMap
        int n=nums.length;
        int count=0;
        int prefixSum[]=new int[n];

        prefixSum[0]=nums[0];
        for(int i=1;i<n;i++){
            prefixSum[i]=nums[i]+prefixSum[i-1];
        }

        Map<Integer,Integer> prefixMap=new HashMap<>();
        for(int i=0;i<n;i++){
            if(prefixSum[i]==k){
                count++;
            }
            int val=prefixSum[i]-k;
            if(prefixMap.containsKey(val)){
                count+=prefixMap.get(val);
            }

            if(!prefixMap.containsKey(prefixSum[i])){
                prefixMap.put(prefixSum[i],0);
            }
            prefixMap.put(prefixSum[i], prefixMap.get(prefixSum[i]) + 1);
        }
        return count;


//More Optimised Approach
        // int count = 0;
        // int currentPrefixSum = 0;
        // Map<Integer, Integer> prefixMap = new HashMap<>();
        // prefixMap.put(0, 1); 
        
        // for (int num : nums) {
        //     currentPrefixSum += num;
        //     int targetOldSum = currentPrefixSum - k;
        //     if (prefixMap.containsKey(targetOldSum)) {
        //         count += prefixMap.get(targetOldSum);
        //     }
        //     prefixMap.put(currentPrefixSum, prefixMap.getOrDefault(currentPrefixSum, 0) + 1);
        // }
        
        // return count;
    }
    
}