package t006;

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] dp = new int[m+1][n+1];
        dp[0][1] = 1;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // if (obstacleGrid[i-1][j-1] == 1) {
                //     dp[i][j] = 0;
                // } else {
                //     dp[i][j] = dp[i][j-1] + dp[i-1][j];
                // }
                if (obstacleGrid[i-1][j-1] != 1) {
                    dp[i][j] = dp[i][j-1] + dp[i-1][j];
                }
            }
        }
        return dp[m][n];
    }
}