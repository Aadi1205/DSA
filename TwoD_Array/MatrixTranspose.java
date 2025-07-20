package TwoD_Array;

public class MatrixTranspose {
    public static int[][] transpose(int[][] matrix) { // <-- made static otherwise code will not work
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }

    public static void main(String[] args) {
        int [][] matrix =  { {1,2,3}, 
                            {4,5,6}, 
                            {7,8,9} };
        int result[][] = transpose(matrix);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }

}
    

