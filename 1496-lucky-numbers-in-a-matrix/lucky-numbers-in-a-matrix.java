class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < matrix.length; i++) {
            int minrow = matrix[i][0];

            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] < minrow) {
                    minrow = matrix[i][j];
                }
            }
            int maxcol = minrow;
            int col = 0;

            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == minrow) {
                    col = j;
                    break;
                }
            }

            for(int k = 0; k < matrix.length; k++) {
                if(matrix[k][col] > maxcol) {
                    maxcol = matrix[k][col];
                }
            }
            if(minrow == maxcol) {
                ans.add(minrow);
            }
        }
        return ans;
    }
}