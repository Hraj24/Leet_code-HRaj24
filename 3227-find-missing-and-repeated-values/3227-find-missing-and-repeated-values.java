class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
    //     int n = grid.length;
    //     int[] map = new int[n * n + 1];
    //     int[] ans = new int[2];

    //     for(int i = 0; i < n; i++){
    //         for(int j = 0; j < n; j++){
    //             map[grid[i][j]]++;
    //         }
    //     }
    //     for(int i = 0; i < map.length; i++) 
    //     {
    //         if(map[i] == 2){
    //             ans[0] = i;  
    //         }
    //         if(map[i] == 0){
    //             ans[1] = i;
    //         }
    //     }
    //     return ans; 
    // 




        int[] ans = new int[2];
        Set<Integer> s = new HashSet<>();
        int n = grid.length;
        
        int a = 0; 
        int b = 0; 
        
        int expSum = 0; 
        int actualSum = 0; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int currentValue = grid[i][j];
                actualSum += currentValue;
                if (s.contains(currentValue)) {
                    a = currentValue;
                } else {
                    s.add(currentValue);
                }
            }
        }
        expSum = (n*n) * ((n*n) + 1) / 2;
        
        b = (int) (expSum - actualSum + a);

        ans[0] = a;
        ans[1] = b; 
        
        return ans;
    }
}