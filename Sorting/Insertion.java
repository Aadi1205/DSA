// pick an element(from unsorted part) and place in the right position in sorted part
// time complexity: O(n^2)
package Sorting;

public class Insertion {
    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // finding out the correct position to insert
            while (prev >= 0 && arr[prev] > curr) { // descending: ( arr[prev] < curr )
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = curr;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 2, 1, 3 };
        insertionSort(arr);

    }

}
