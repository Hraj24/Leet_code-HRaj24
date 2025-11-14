class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        boolean dp[][]=new boolean [n+1][m+1];
        dp[0][0]=true;

        for(int j=1;j<=m;j++){
            if(p.charAt(j-1)=='*'){
                dp[0][j]=dp[0][j-1];
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                } else {
                    dp[i][j] = false;
                }
            }
        }

        return dp[n][m];



//Memoization
        // int[][] dp = new int[n1][n2];
        // for (int[] row : dp) {
        //     Arrays.fill(row, -1);
        // }
        // return solve(n1 - 1, n2 - 1, s, p,dp);
    }
    public boolean solve(int index1, int index2, String text, String pattern,int [][]dp) {
        if (index1 < 0 && index2 < 0) return true;
        if (index2 < 0 && index1 >= 0) return false;
        if (index1 < 0 && index2 >= 0) {
            for (int i = 0; i <= index2; i++) {
                if (pattern.charAt(i) != '*') return false;
            }
            return true;
        }

        if (dp[index1][index2] != -1) {
            return dp[index1][index2] == 1;
        }

        if (text.charAt(index1) == pattern.charAt(index2) || pattern.charAt(index2) == '?') {
            dp[index1][index2] = solve(index1 - 1, index2 - 1, text, pattern, dp) ? 1 : 0;
        } else if (pattern.charAt(index2) == '*') {
            dp[index1][index2] = (solve(index1 - 1, index2, text, pattern, dp) || solve(index1, index2 - 1, text, pattern, dp)) ? 1 : 0;
        } else {
            dp[index1][index2] = 0;
        }
        return dp[index1][index2] == 1;
    }
}