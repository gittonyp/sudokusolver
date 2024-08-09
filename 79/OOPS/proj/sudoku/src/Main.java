import java.util.Arrays;
public class Main {
public static void main(String[] args) {
        int board[][] = { { 0, 0, 9, 0, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 4, 0, 5, 0, 0, 0 },
                { 8, 0, 0, 0, 3, 0, 0, 0, 2 },
                { 0, 5, 0, 1, 0, 7, 0, 6, 0 },
                { 0, 0, 1, 0, 0, 0, 3, 0, 0 },
                { 0, 6, 0, 5, 0, 3, 0, 7, 0 },
                { 1, 0, 0, 0, 5, 0, 0, 0, 9 },
                { 0, 0, 0, 7, 0, 4, 0, 0, 0 },
                { 0, 0, 2, 0, 0, 0, 8, 0, 0 } };

        SudokuSolver sud = new SudokuSolver();
        if (sud.solveSudoku(board, 0, 0)) {
            System.out.println("Solved Sudoku:");
            printBoard(board);
        } else {
            System.out.println("No solution found.");
        }
    }

    static void printBoard(int[][] board) {
        for (int i = 0; i<9; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
    } }
class SudokuSolver {
    boolean solveSudoku(int[][] board, int i, int j) {
        if (i == 9) {
            return true; // Reached the end of the board
        }

        if (j == 9) {
            return solveSudoku(board, i + 1, 0); // Move to the next row
        }

        if (board[i][j] != 0) {
            return solveSudoku(board, i, j + 1); // Move to the next column
        }

        for (int num = 1; num <= 9; num++) {
            board[i][j] = num; // Try placing a number

            if (check(board, i, j) && solveSudoku(board, i, j + 1)) {
                return true; // Found a valid number
            }

            board[i][j] = 0; // Backtrack: Reset the cell to 0
        }

        return false; // No valid number found
    }

    boolean check(int[][] board, int i, int j) {
        int num = board[i][j];
        for (int k = 0; k < 9; k++) {
            // Skip checking the cell itself
            if (num == board[i][k] && k != j && num != 0) {
                return true;
            }
        }

        for (int k = 0; k < 9; k++) {
            // Skip checking the cell itself
            if (num == board[k][j] && k != i && num != 0) {
                return true;
            }
        }

        int boxRowStart = (i / 3) * 3;
        int boxColStart = (j / 3) * 3;
        for (int k = boxRowStart; k < boxRowStart + 3; k++) {
            for (int l = boxColStart; l < boxColStart + 3; l++) {
                // Skip checking the cell itself
                if (num == board[k][l] && k != i && l != j && num != 0) {
                    return true;
                }
            }
        }

        return false;
    }

}
