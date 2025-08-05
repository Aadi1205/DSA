package GreedyAlgorithm;

import java.util.*;

public class FractionalKnapsack {

    // Function to calculate max value using fractional knapsack logic
    public static int getMaxKnapsackValue(int[] weight, int[] val, int W) {
        int n = weight.length;

        // Step 1: Store index and value/weight ratio
        double[][] ratio = new double[n][2]; // [index, ratio]
        for (int i = 0; i < n; i++) {
            ratio[i][0] = i; // store index
            ratio[i][1] = (double) val[i] / weight[i]; // store value/weight ratio
        }

        // Step 2: Sort items by ratio in ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        // Step 3: Fill the knapsack greedily from highest ratio
        double finalVal = 0;
        int capacity = W;

        for (int i = n - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];

            if (capacity >= weight[idx]) {
                // Take the full item
                finalVal += val[idx];
                capacity -= weight[idx];
            } else {
                // Take the fractional part
                finalVal += ratio[i][1] * capacity;
                break; // knapsack is full
            }
        }

        return (int) finalVal;
    }

    public static void main(String[] args) {
        int W = 50;
        int[] weight = {10, 20, 30};
        int[] val = {60, 100, 120};

        double result = getMaxKnapsackValue(weight, val, W);
        System.out.println("Final value: " + result);
    }
}
