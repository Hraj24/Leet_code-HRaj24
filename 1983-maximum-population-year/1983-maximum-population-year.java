class Solution {
    public int maximumPopulation(int[][] logs) {
        if(logs.length==1){
            return logs[0][0];
        }

        int p[]= new int[101];

        for(int [] log:logs){
            p[log[0]-1950]++;
            p[log[1]-1950]--;
        }

        int []res=new int[101];

        res[0]=p[0];

        int maxi=0;

        for(int i=1;i<101;i++){
            res[i]=res[i-1]+p[i];
            maxi=Math.max(res[i],maxi);
        }

        int ans=0;
        
        for(int i=0;i<101;i++){
            if(res[i]==maxi) {
                ans= i+1950;
                break;
            }
        }
        return ans;
    }
}