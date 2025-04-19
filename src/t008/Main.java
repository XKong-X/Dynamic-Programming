package t008;

class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n+1][n+2];
        for (int i = 1; i <= n; i++) {
            dp[i][0] = dp[i][n+1] = Integer.MAX_VALUE;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = Math.min(Math.min(dp[i-1][j-1],dp[i-1][j]), dp[i-1][j+1]) + matrix[i-1][j-1];
            }
        }

        int ret = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            ret = Math.min(ret, dp[n][i]);
        }
        return ret;
    }
}
