package GreedyAlgorithm.Advance;

public class LexicoSmallestString {
    public static String getSmallestString(int n, int k) {
        char[] result = new char[n];
        // Step 1: Fill with 'a'
        for (int i = 0; i < n; i++) {
            result[i] = 'a';
        }

        // Step 2: Calculate extra value to distribute
        int remaining = k - n;

        // Step 3: Start from end and distribute
        int index = n - 1;
        while (remaining > 0) {
            int add = Math.min(25, remaining);
            result[index] += add; // add to 'a'
            remaining -= add;
            index--;
        }

        return new String(result);
    }

    public static void main(String[] args) {
        int N = 5, K = 42;
        System.out.println(getSmallestString(N, K));  // Output: "aaacz"
    }
}
