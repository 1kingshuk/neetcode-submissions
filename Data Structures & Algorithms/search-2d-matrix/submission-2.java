class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean targetExists = false;
        int rows = matrix.length;
        int columns = matrix[0].length;

        int low = 0;
        int high = (rows * columns)-1;

        while(low<=high) {
            int mid = (high + low)/2;

            int rowIndex = mid/columns;
            int columnIndex = mid%columns;

            if (target == matrix[rowIndex][columnIndex]) {
                targetExists = true;
                return targetExists;
            } else if (target > matrix[rowIndex][columnIndex]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return targetExists;
    }
}
