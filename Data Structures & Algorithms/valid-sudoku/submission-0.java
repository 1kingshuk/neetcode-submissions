class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> sudokuNums = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                if (num != '.') {
                    if (!sudokuNums.add(num + " at row " + i)
                        || !sudokuNums.add(num + " at col " + j)
                        || !sudokuNums.add(num + " at box " + i / 3 + "," + j / 3)) {
                        return false;
                    } else {
                        sudokuNums.add(num + " at row " + i);
                        sudokuNums.add(num + " at col " + j);
                        sudokuNums.add(num + " at box " + i / 3 + "," + j / 3);
                    }
                }
            }
        }
        return true;
    }
}
