package TwoD_Array;

public class SumOfRow {
    public static void Sum(int mat[][]) {
        int sum = 0;
        
            for(int j=0; j<mat[0].length; j++) {
                sum += mat[1][j];
            }
            System.out.println("Sum of 2nd row is " + sum);
        }
        
    
    public static void main(String[] args) {
        int [][] matrix =  {{1,2,3}, 
                            {4,7,6}, 
                            {7,8,9} };
        Sum(matrix);
    }
}
