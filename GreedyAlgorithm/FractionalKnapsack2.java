package GreedyAlgorithm;

import java.util.*;

public class FractionalKnapsack2 {

    // Helper class to represent an item
    static class Item {
        int weight, value;

        Item(int w, int v) {
            this.weight = w;
            this.value = v;
        }

        // Calculate value per unit weight
        double getRatio() {
            return (double) value / weight;
        }
    }

    // Function to calculate maximum value for given capacity
    public static double getMaxValue(Item[] items, int capacity) {
        // Sort items based on value-to-weight ratio in descending order
        Arrays.sort(items, (a, b) -> Double.compare(b.getRatio(), a.getRatio()));

        double totalValue = 0;
        int remaining = capacity;

        for (Item item : items) {
            if (remaining >= item.weight) {
                // Take full item
                totalValue += item.value;
                remaining -= item.weight;
            } else {
                // Take fractional item
                totalValue += item.getRatio() * remaining;
                break; // knapsack is full
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        int[] weight = {10, 20, 30};
        int[] value = {60, 100, 120};
        int capacity = 50;

        Item[] items = new Item[weight.length];
        for (int i = 0; i < weight.length; i++) {
            items[i] = new Item(weight[i], value[i]);
        }

        double maxValue = getMaxValue(items, capacity);
        System.out.println("Maximum value in Knapsack: " + maxValue);
    }
}
