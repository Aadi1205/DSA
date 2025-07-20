// matrix is row wise and Col wise sorted & we have to search a key in it

// Approach 1 : Brute force --> O(m*n)

// Approach 2 : Binary Search row wise--> O(n*log n)

// Approach 3 : Stair case Search --> O(m+n) --> Optimized
package TwoD_Array;

public class SearchSorted { // Either this method
    public static boolean Search(int matrix[][], int key) {
        int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) { // boundaries of a matrix
            if (matrix[row][col] == key) {
                System.out.println("Found key at (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static boolean Search2(int matrix[][], int key) { // or this method both are same
        int row = matrix.length - 1, col = 0;

        while (row >= 0 && col < matrix.length) {
            if (key == matrix[row][col]) {
                System.out.println("Found key at (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                row--;
            } else {
                col++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        int key = 33;
        Search2(matrix, key); // both methods (Search, Search2) will give same result

    }
}
