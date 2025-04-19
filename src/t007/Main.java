package t007;

class Solution {
    public int jewelleryValue(int[][] frame) {
        int m = frame.length, n = frame[0].length;
        int[][] dp = new int[m+1][n+1];

        for (int i = 1; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]) + frame[i-1][j-1];
            }
        }
        return dp[m][n];
    }
}
