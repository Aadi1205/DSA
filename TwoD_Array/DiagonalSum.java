// we solve this problem for n X n matrix only not for n X m
package TwoD_Array;

public class DiagonalSum {
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;

        // O(n^2) brute force => not optimized
        
        // for(int i=0; i<matrix.length; i++) {
        //     for(int j=0; j<matrix[0].length; j++) {
        //         // Condition for Primary Diagonal \
        //         if(i == j ) {
        //             sum += matrix[i][j];
        //         }
        //         // Condition for Secondary Diagonal / 
        //         if( i + j == matrix.length -1 && i !=j) {
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        for(int i=0; i<matrix.length; i++) {
            // primary diagonal
            sum += matrix[i][i];

            // secondary diagonal
            if(i != matrix.length - i - 1) {  // simply i != j
                sum += matrix[i][matrix.length-1-i]; // i+j = n-1 --> j = n-1-i
            }        
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13, 14, 15, 16}};
        System.out.println("sum of Primary and Secondary diagonals of a Matrix is: " + diagonalSum(matrix));

        // if(0.1 + 0.2 == 0.3) {
        //     System.out.println("True");
        // }
        // else {
        //     System.out.println("False");
        // }
    }
}
