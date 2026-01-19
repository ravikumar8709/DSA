
public class twoDmatrixII {

    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;        // number of rows
        int n = matrix[0].length;     // number of columns

        int row = 0;                  // start from top row
        int col = n - 1;              // start from last column (top-right)

        // Traverse until indices go out of matrix bounds
        while (row < m && col >= 0) {

            if (matrix[row][col] == target) {
                return true;          // target found
            } else if (matrix[row][col] > target) {
                col--;                // move left
            } else {
                row++;                // move down
            }
        }

        // target not found
        return false;
    }
}
