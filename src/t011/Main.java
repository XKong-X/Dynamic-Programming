package t011;

class Solution {
    public int massage(int[] nums) {
        int n = nums.length;
        if (n == 0) return n;

        int[] f = new int[n];
        int[] g = new int[n];
        f[0] = nums[0];

        for (int i = 1; i < n; i++) {
            f[i] = g[i-1] + nums[i];
            g[i] = Math.max(f[i-1], g[i-1]);
        }

        return Math.max(f[n-1], g[n-1]);
    }
}
