class Solution {
    public int minCost(String colors, int[] neededTime) {
        int time=0;
        int n=colors.length();
        for(int i=1;i<n;i++){
            if(colors.charAt(i-1)==colors.charAt(i)){
                time+=Math.min(neededTime[i-1],neededTime[i]);
                neededTime[i]=Math.max(neededTime[i],neededTime[i-1]);
            }
        }
        return time;
    }
}