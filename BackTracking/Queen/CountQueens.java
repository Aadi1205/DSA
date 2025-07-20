package BackTracking.Queen;

public class CountQueens {
    static int count;

    public static boolean isSafe(char board[][], int row, int col) {
        // vertically up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') return false;
        }

        // diag left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // diag right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    public static void nQueen(char board[][], int row) {
        if (row == board.length) {
            count++;
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                nQueen(board, row + 1);
                board[row][col] = '.'; // backtrack
            }
        }
    }

    public static void main(String[] args) {
        int n = 8; // you can change this to any value
        char[][] board = new char[n][n];

        // initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        nQueen(board, 0);
        System.out.println("Number of solutions: " + count);
    }
}
