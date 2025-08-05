package GreedyAlgorithm;

import java.util.Arrays;

public class MinAbsoluteDiff {

    public static int minAbsoluteSumDiff(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        
        int res = 0;
        for (int i = 0; i < A.length; i++) {
            res += Math.abs(A[i] - B[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        int[] B = {2, 1, 3};
        
        int result = minAbsoluteSumDiff(A, B);
        System.out.println(result); // Output: 0
    }
}
