class NumMatrix {
    int[][] presum;

    public NumMatrix(int[][] matrix) {
        presum = new int[matrix.length + 1][matrix[0].length + 1];

        for (int row = 1; row <= matrix.length; row++) {
            for (int col = 1; col <= matrix[0].length; col++) {

                presum[row][col] = presum[row][col - 1]
                        + presum[row - 1][col]
                        - presum[row - 1][col - 1]
                        + matrix[row - 1][col - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return presum[row2 + 1][col2 + 1]
                - presum[row1][col2 + 1]
                - presum[row2 + 1][col1]
                + presum[row1][col1];
    }
}