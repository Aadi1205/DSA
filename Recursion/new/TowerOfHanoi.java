package Recursion.HomeWork;

public class TowerOfHanoi {  // TC : O(2^n) SC: O(n)
    public static void towerOfHanoi(int n, char source, char helper, char destination) {
        // Base case
        if(n == 1) {
            System.out.println("Move disk " + n + " from " + source + " to " + destination);
            return;
        }

        // Step 1: Move n-1 disks from source to helper
        towerOfHanoi(n - 1, source, destination, helper);

        // Step 2: Move nth (largest) disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Step 3: Move n-1 disks from helper to destination
        towerOfHanoi(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        towerOfHanoi(n, 'A', 'B', 'C');
        
    }
}
