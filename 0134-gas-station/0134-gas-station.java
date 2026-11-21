class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        // for(int i=0;i<n;i++){
        //     int totalCost=gas[i]-cost[i];
        //     if(gas[i]<cost[i]){
        //         continue;
        //     }
        //         int j=(i+1)%n;
        //         while(j!=i){
        //             totalCost=totalCost+gas[j]-cost[j];
        //             if(totalCost<0){
        //                 break;
        //             }
        //             j=(j+1)%n;
        //         }
        //         if(totalCost>=0){
        //             return i;
        //         }
        // }
        // return -1;


        int totalGas=0;
        int totalCost=0;
        for(int i=0;i<n;i++){
            totalGas+=gas[i];
            totalCost+=cost[i];
        }
        if(totalGas<totalCost){
            return -1;
        }
        int resultIndex=0;
        int totalTank=0;
        for(int i=0;i<n;i++){
            totalTank+=gas[i]-cost[i];
            if(totalTank<0){
                resultIndex=i+1;
                totalTank=0;
            }
        }
        return resultIndex;
    }
}