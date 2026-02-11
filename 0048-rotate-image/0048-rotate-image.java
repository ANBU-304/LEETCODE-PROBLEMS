class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int k = 0;
        int m = 0;

        int[][] res = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = n - 1; j >= 0; j--) {
                res[k][m] = matrix[j][i];
                m++;
            }
            k++;
            m = 0;
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = res[i][j];
            }
        }
    }
}
