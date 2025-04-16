package t004;

class Solution {
    public int numDecodings(String s) {
        // int n = s.length();
        // char[] ss = s.toCharArray();
        // int[] dp = new int[n];

        // // 初始化第一个位置
        // if (ss[0] != '0') dp[0] = 1;
        // if (n == 1) return dp[0];

        // // 初始化第二个位置
        // if (ss[0] != '0' && ss[1] != '0') dp[1] = 1;
        // int tmp = (ss[0] - '0') * 10 + ss[1] - '0';
        // if (tmp >= 10 && tmp <= 26) dp[1] += 1;

        // for (int i = 2; i < n; i++) {
        //     if (ss[i] != '0') dp[i] += dp[i - 1];
        //     int num = (ss[i - 1] - '0') * 10 + ss[i] - '0';
        //     if (num >= 10 && num <= 26) dp[i] += dp[i - 2];
        // }
        // return dp[n - 1];

        // 初始化逻辑优化
        int n = s.length();
        char[] ss = s.toCharArray();
        int[] dp = new int[n + 1];

        dp[0] = 1;// 保证后续填表正确
        if (ss[1 - 1] != '0') dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            if (ss[i - 1] != '0') dp[i] += dp[i - 1];
            int num = (ss[i - 2] - '0') * 10 + ss[i - 1] - '0';
            if (num >= 10 && num <= 26) dp[i] += dp[i - 2];
        }
        return dp[n];
    }
}
