class Solution {
    public int[] shuffle(int[] nums, int n) {
        int x=n*2;
        int [] res=new int[x];
        
        
        for(int i=0,j=0;i<x;i++){
            if(i%2==0){
                res[i]=nums[j++];
            }else{
                res[i]=nums[n++];
            }
        }
        return res;
    }
}