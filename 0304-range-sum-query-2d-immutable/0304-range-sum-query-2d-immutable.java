class NumMatrix {
    int[][] prefix;
    int[][] column;

    public NumMatrix(int[][] matrix) {

        prefix = new int[matrix.length][matrix[0].length];

        // Row prefix sums
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (j == 0) {
                    prefix[i][j] = matrix[i][j];
                } else {
                    prefix[i][j] = prefix[i][j - 1] + matrix[i][j];
                }
            }
        }

        column = new int[matrix.length][matrix[0].length];

        // Column prefix sums
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (i == 0) {
                    column[i][j] = prefix[i][j];
                } else {
                    column[i][j] = column[i - 1][j] + prefix[i][j];
                }
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {

        int total = column[row2][col2];

        if (row1 > 0)
            total -= column[row1 - 1][col2];

        if (col1 > 0)
            total -= column[row2][col1 - 1];

        if (row1 > 0 && col1 > 0)
            total += column[row1 - 1][col1 - 1];

        return total;
    }
}