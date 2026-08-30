class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean targetExists = false;
        int rows = matrix.length;
        int columns = matrix[0].length;
        int rowNumWithTarget = possibleRowContainingTarget(matrix, rows, columns, target);
        for (int i=0; i< columns; i++) {
            if (matrix[rowNumWithTarget][i]==target) {
                targetExists = true;
            }
        }
        return targetExists;
        
    }

    private int possibleRowContainingTarget(int[][] matrix, int rows, int columns, int target) {
        for (int i=0; i<rows; i++) {
            if (matrix[i][columns-1]>=target) {
                return i;
            }
        }
        return 0;
    }
}
