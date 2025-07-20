public class BinarySearch {
    public static int binarySearch(int arr[], int key) {
        int start = 0; // start index
        int end = arr.length - 1; // end index

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) { // found
                return mid;
            }
            if (arr[mid] > key) { // left
                end = mid - 1;
            }
            if (arr[mid] < key) { // right
                start = mid + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        int arr[] = { 2, 4, 5, 6, 8, 10, 12 };
        int key = 10;
        int result = binarySearch(arr, key);

        if (result == -1) {
            System.out.println("Element isn't found");
        } else {
            System.out.println("Element is present at index: " + result);
        }

    }
}
