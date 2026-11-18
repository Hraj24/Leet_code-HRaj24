class Solution {
    public int minGroups(int[][] intervals) {
        // int maxCnt=0;
        // int n=intervals.length;
        // for(int i=0;i<n;i++){
        //     int cnt=1;
        //     for(int j=i+1;j<n;j++){
        //         if(intervals[j][0] <= intervals[i][0] && intervals[i][0] <= intervals[j][1]){
        //             cnt++;
        //         }
        //     }
        //     maxCnt=Math.max(maxCnt,cnt);
        // }
        // return maxCnt;

        int n=intervals.length;
        int [] start=new int[n];
        int [] end=new int[n];
        for(int k=0;k<n;k++){
            start[k]=intervals[k][0];
            end[k]=intervals[k][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int i=0,j=0;
        int cnt=0,maxCnt=0;
        
        while(i<n){
            if(start[i]<=end[j]){
                cnt++;
                i++;
            }else{
                cnt--;
                j++;
            }
            maxCnt=Math.max(maxCnt,cnt);
        }
        return maxCnt;
    }
}