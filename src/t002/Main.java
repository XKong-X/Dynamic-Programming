package t002;

class Solution {
    public int waysToStep(int n) {
        if (n == 1 || n == 2) return n;
        if (n == 3) return 4;

        int MOD = (int)1e9 + 7;

        int a = 1, b= 2, c = 4, dp = 0;
        for (int i = 4; i <= n; i++) {
            dp = ((a + b) % MOD + c) % MOD;
            a = b;
            b = c;
            c = dp;
        }
        return dp;
    }
}