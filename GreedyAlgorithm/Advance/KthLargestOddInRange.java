package GreedyAlgorithm.Advance;

public class KthLargestOddInRange {

    public static int kthLargestOdd(int L, int R, int K) {
        // Step 1: Find the largest odd ≤ R
        int largestOdd = (R % 2 == 1) ? R : R - 1;

        // Step 2: Count number of odds in range
        int count;
        if (L % 2 == 1) {
            count = (R - L) / 2 + 1;
        } else {
            count = (R - L + 1) / 2;
        }

        // Step 3: Check if K is valid
        if (K > count) {
            return -1; // Not enough odd numbers
        }

        // Step 4: Return Kth largest odd number
        return largestOdd - 2 * (K - 1);
    }

    public static void main(String[] args) {
        int L = 3, R = 15, K = 4;
        int result = kthLargestOdd(L, R, K);
        System.out.println("Kth largest odd number is: " + result);
    }
}

