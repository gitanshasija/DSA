class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][]ans = new int[matrix[0].length][matrix.length];
        int row = matrix.length;
        
        for(int i = 0;i<row;i++){
            for(int j = 0;j<matrix[i].length;j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}