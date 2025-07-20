package HomeWork;

import java.util.ArrayList;
import java.util.Arrays;

public class MostFrequent {

    public static int mostFrequent(ArrayList<Integer> num, int key) {
        int[] result = new int[1000]; // Frequency array for values 1 to 1000

        // Step 1: Count frequencies of elements that come immediately after the key
        for (int i = 0; i < num.size() - 1; i++) {
            if (num.get(i) == key) {
                result[num.get(i + 1) - 1]++;
            }
        }

        // Step 2: Find the number with the highest frequency
        int max = Integer.MIN_VALUE;
        int ans = 0;

        for (int i = 0; i < 1000; i++) {
            if (result[i] > max) {
                max = result[i];
                ans = i + 1; // +1 to adjust index to number
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(2, 3, 2, 4, 2, 3));
        int key = 2;

        int result = mostFrequent(num, key);
        System.out.println("Most frequent number after " + key + " is: " + result);
    }
}
