package TwoD_Array;

public class OccurrenceCount {
    public static int countOccurrence(int[][] arr, int target) {
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                if(arr[i][j] == target) {
                    count ++;
                }
            }
        }
        System.out.println("Count of " + target + " is " + count);
        return count;
    }
    public static void main(String[] args) {
        int [][] matrix =  {{1,2,3}, 
                            {4,7,6}, 
                            {7,8,9} };
        int result = countOccurrence(matrix, 7);
        System.out.println(result);
        
    }
}
