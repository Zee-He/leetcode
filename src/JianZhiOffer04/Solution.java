package JianZhiOffer04;

class Solution {//O(n)=m+n,O(1)
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length==0||matrix[0].length==0||matrix==null)
            return false;
        int m = matrix.length-1;
        int n = matrix[0].length-1;
        int i=m;
        int j=0;
            while(i>=0&&j<=n){
                if (target>matrix[i][j]){
                    j++;
                    continue;
                }
                if (target<matrix[i][j]){
                    i--;
                    continue;
                }
                if (target==matrix[i][j]){
                    return true;
                }
            }
        return false;
    }
}