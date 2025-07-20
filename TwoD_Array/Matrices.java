// basic input and printing of 2D array
package TwoD_Array;
import java.util.*;

public class Matrices {
    public static boolean Search(int matrix[][], int key) {
        for(int i=0; i<matrix.length; i++) {
        for(int j=0; j<matrix[0].length; j++) {
            if(matrix[i][j] == key) {
                System.out.println("key is present at index: " + i + " " + j);
                return true;
            }
        }
    }
    System.out.println("Key not found!");
    return false;
    }
    
    public static void main(String[] args) {
    int matrix[][] = new int[3][3];
    int n = matrix.length; // Rows
    int m = matrix[0].length; // Column
    Scanner sc = new Scanner(System.in);
    for(int i=0; i<n; i++) {
        for(int j=0; j<m; j++) {
            System.out.println("Enter value for index: " + i + " " + j);
            matrix [i][j] = sc.nextInt();
        }
    }
    System.out.println("Printing Elements: ");
    for(int i=0; i<n; i++) {
        for(int j=0; j<m; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }

    System.out.println("Enter key to search: ");
    int key = sc.nextInt();

    Search(matrix, key);
    sc.close();
    

}

}
// In Java, a 2D array is stored as an array of rows.
// Example: int[][] arr = {{1, 2}, {3, 4}};
// First row is arr[0] = {1, 2}, second row is arr[1] = {3, 4}.
// Stored in row-wise (row-major) order in memory.


// Questions
// Largest Element of 2D Array
// smallest Element of 2D Array

