package JianZhiOffer47;

class Solution {
    public int maxValue(int[][] grid) {
        int row = grid.length;
        int line = grid[0].length;
        int dp[][] = new int[row][line];
        for (int i=0;i<row;i++){
            for (int j=0;j<line;j++){
                if (i==0&&j==0) dp[i][j]=grid[i][j];
                if (i==0&&j!=0) dp[i][j]=dp[i][j-1]+grid[i][j];
                if (i!=0&&j==0) dp[i][j]=dp[i-1][j]+grid[i][j];
                if (i!=0&&j!=0) dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j])+grid[i][j];
            }
        }
        return dp[row-1][line-1];
    }
}