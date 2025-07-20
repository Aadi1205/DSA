// brute force approach

package BackTracking.Queen;

public class AllQueenCombinations
{
    static int count=0;
    public static boolean isSafe(char board[][], int row, int col) {
        //vertically up
        for(int i=row-1; i>=0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        //diag left up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        //diag right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        
        return true;
    }

    public static void printBoard(char board[][]) {
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j] + " " );
            }
            System.out.println();
        }
    }
    public static void nQueen(char board[][], int row) {
        //base case
        if(row == board.length) {
            //To count no. of solutions count++;
            count++;

            printBoard(board);
            System.out.println("\n");
            return;
        }
        //column loop
        for(int col=0; col<board.length; col++) {
            if(isSafe(board, row, col)) {
                board[row][col] = 'Q';
                nQueen(board, row+1); // recursion
                board[row][col] = '.';  // backtracking step
            }
            
        }
    }
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        //initialize
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = '.';
            }
        }

        nQueen(board, 0);
        System.out.println("Number of solutions: " + count);
    }
}
