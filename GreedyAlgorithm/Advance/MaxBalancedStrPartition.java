package GreedyAlgorithm.Advance;

public class MaxBalancedStrPartition {
    public static int maxBalancedPartitions(String str) {
        int balance = 0; // net balance of R - L
        int count = 0;   // number of balanced substrings

        for (char ch : str.toCharArray()) {
            if (ch == 'R') {
                balance++;
            } else if (ch == 'L') {
                balance--;
            }

            if (balance == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";
        System.out.println("Max Balanced Partitions: " + maxBalancedPartitions(str));
    }
}
