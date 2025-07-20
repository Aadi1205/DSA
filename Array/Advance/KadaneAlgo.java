// IMP

package Advance;

public class KadaneAlgo {
    public static void Kad(int arr[]) {
        int currSum = 0; 
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];  // to avoid negative sum error
            maxSum = Math.max(maxSum, currSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        System.out.println("Maximum contiguous sum is " + maxSum);
    }

    public static void main(String args[]) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        Kad(arr);

        int neg[] = {-1, -2, -3, -4, -5};
        Kad(neg);
    }
}
// Your mistake was checking `arr[i] + currSum < 0` before updating `currSum`, 
// which skips valid negative sums and can give wrong results for all-negative arrays.
