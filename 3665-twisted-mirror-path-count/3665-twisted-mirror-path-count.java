class Solution {
    public int uniquePaths(int[][] grid) {
        final int MOD = 1_000_000_007;
        int m = grid.length, n = grid[0].length;
        // R[i][j]: ways to enter (i,j) moving right; D[i][j]: ways to enter moving down
        long[][] R = new long[m][n], D = new long[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                long total = (i == 0 && j == 0) ? 1 : (R[i][j] + D[i][j]) % MOD;
                if (i == m - 1 && j == n - 1) return (int) total;

                long outRight, outDown;
                if (grid[i][j] == 0) {
                    outRight = total;
                    outDown = total;
                } else {                         
                    outDown = R[i][j];
                    outRight = D[i][j];
                }
                if (j + 1 < n) R[i][j + 1] = (R[i][j + 1] + outRight) % MOD;
                if (i + 1 < m) D[i + 1][j] = (D[i + 1][j] + outDown) % MOD;
            }
        }
        return 0;
    }
}