class Solution {
    int dp[][][];
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        dp = new int[n + 1][m + 1][m + 1];
        for(int i[][]: dp)
        {
            for(int j[]: i)
            {
                Arrays.fill(j, -1);
            }
        }
        return solve(0,0,m-1,grid);
    }
    public int solve(int i,int j1,int j2,int[][] grid)
    {
        if(i < 0 || j1 >= grid[0].length || j2 >= grid[0].length || j1 < 0 || j2 < 0) return 0;

        if(i == grid.length) return 0;

        if(dp[i][j1][j2] != -1) return dp[i][j1][j2];

        int res = 0;
        res += grid[i][j1];
        res += grid[i][j2];
        
        int max = 0;
        for(int k1 = j1- 1; k1 <= j1 + 1; k1++)
        {
            for(int k2 = j2 - 1; k2 <= j2 + 1; k2++)
            {
                if(k1 < k2)
                {
                    max =  Math.max(max, solve(i + 1, k1, k2, grid));
                }
            }
        }
        res += max;
        return dp[i][j1][j2]= res;
    }
}