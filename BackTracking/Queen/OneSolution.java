package BackTracking.Queen;

public class OneSolution {
    static boolean found = false;  // to stop after first solution

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

    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // 🔸 Function to print only one solution
    public static void printOneSolution(char[][] board, int row) {
        if (found) return; // stop if already found

        if (row == board.length) {
            printBoard(board);
            found = true;
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                printOneSolution(board, row + 1);
                board[row][col] = '.'; // backtrack
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];

        // initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        printOneSolution(board, 0); // call the one-solution function
    }
}
