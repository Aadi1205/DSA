// DSA Sheet #6
package HomeWork;

public class Question2 {

    // Main search function
    public static int Search(int[] arr, int target) {
        int min = minSearch(arr);

        // Decide which side to search
        if (target >= arr[min] && target <= arr[arr.length - 1]) {
            return binarySearch(arr, min, arr.length - 1, target);
        } else {
            return binarySearch(arr, 0, min - 1, target);
        }
    }

    // Standard binary search
    public static int binarySearch(int arr[], int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    // Find index of the minimum (rotation pivot)
    public static int minSearch(int arr[]) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left; // Index of the smallest element
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = Search(arr, target);
        System.out.println("Index of " + target + " is: " + result);
    }
}
