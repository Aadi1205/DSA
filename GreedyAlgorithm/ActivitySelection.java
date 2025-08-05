package GreedyAlgorithm;

import java.util.*;

public class ActivitySelection {

    // Function to perform activity selection
    public static void selectMaxActivities(int[] start, int[] end) {
        int n = start.length;

        // Step 1: Create a 2D array to hold index, start time, and end time
        int[][] activities = new int[n][3];
        for (int i = 0; i < n; i++) {
            activities[i][0] = i;         // activity index
            activities[i][1] = start[i];  // start time
            activities[i][2] = end[i];    // end time
        }

        // Step 2: Sort activities by end time (greedy choice)
        Arrays.sort(activities, Comparator.comparingInt(a -> a[2]));

        // Step 3: Initialize selection
        ArrayList<Integer> selectedActivities = new ArrayList<>();
        int maxActivities = 1; // First activity is always selected
        selectedActivities.add(activities[0][0]); // Store index
        int lastEndTime = activities[0][2]; // End time of last selected activity

        // Step 4: Iterate through the rest of the activities
        for (int i = 1; i < n; i++) {
            if (activities[i][1] >= lastEndTime) {
                // Select the activity if it doesn't overlap
                selectedActivities.add(activities[i][0]);
                maxActivities++;
                lastEndTime = activities[i][2]; // Update last end time
            }
        }

        // Step 5: Print result
        System.out.println("Max activities to select: " + maxActivities);
        for (int index : selectedActivities) {
            System.out.print("A" + index + " ");
        }
    }

    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end   = {2, 4, 6, 7, 9, 9};

        // Call the activity selection function
        selectMaxActivities(start, end);
    }
}
