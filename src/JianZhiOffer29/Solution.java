package JianZhiOffer29;

class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return new int[0];
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[] res = new int[rows * columns];
        int index = 0;
        int left = 0, right = columns - 1, top = 0, bottom = rows - 1;
        while (left<=right&&top<=bottom){
            for (int i=left;i<=right;i++){
                res[index++] = matrix[top][i];
            }
            for (int i=top+1;i<=bottom;i++){
                res[index++] = matrix[i][right];
            }
            if (left < right && top < bottom) {
                for (int i=right-1;i>left;i--){
                    res[index++] = matrix[bottom][i];
                }
                for (int i=bottom;i>top;i--){
                    res[index++] = matrix[i][left];
                }
            }

            left++;
            right--;
            top++;
            bottom--;
        }
        return res;
    }
}