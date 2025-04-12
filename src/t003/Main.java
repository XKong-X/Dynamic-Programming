package t003;

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // // 解法一
        // int n = cost.length;
        // int[] dp = new int[n+1];
        // for (int i = 2; i <= n; i++) {
        //     dp[i] = Math.min(dp[i-1] + cost[i-1], dp[i-2] + cost[i-2]);
        // }
        // return dp[n];

        // 解法二
        int n = cost.length;
        int[] dp = new int[n];
        dp[n-1] = cost[n-1]; dp[n-2] = cost[n-2];
        for (int i = n-3; i >= 0; i--) {
            dp[i] = Math.min(dp[i+1], dp[i+2]) + cost[i];
        }
        return Math.min(dp[0], dp[1]);
    }
}
