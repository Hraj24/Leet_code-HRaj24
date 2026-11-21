class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int result=0;
        int n=capacity.length;
        // for(int i=0;i<capacity.length;i++){
        //     if(capacity[i]-rocks[i]==0){
        //         result++;
        //     }else if(additionalRocks>0){
        //         int required=capacity[i]-rocks[i];
        //         additionalRocks-=required;
        //         result++;
        //     }
        // }
        int []required=new int[n];
        for(int i=0;i<n;i++){
            required[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(required);
        for(int i=0;i<n;i++){
            if(required[i]==0){
                result++;
            }
            else if(additionalRocks>=required[i]){
                additionalRocks-=required[i];
                result++;
            }
        }
        return result;
    }
}