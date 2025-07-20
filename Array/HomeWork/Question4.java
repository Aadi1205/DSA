package HomeWork;

public class Question4 {
    public static int Water(int arr[]) {
        int n = arr.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        leftMax[0] = arr[0];
        rightMax[n - 1] = arr[n - 1];
        // left max array
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }
        // right max array
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }
        // water level
        int waterLevel = 0;
        for (int i = 0; i < n; i++) {
            waterLevel += Math.min(leftMax[i], rightMax[i]) - arr[i]; // water level = min(left max, right max) - arr[i]
        }
        return waterLevel; // return the water level
    }

    public static void main(String[] args) {
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println("WaterLevel:" + Water(height));

    }

}
