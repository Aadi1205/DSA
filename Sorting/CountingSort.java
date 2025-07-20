// difficult 
package Sorting;
import java .util.*;
public class CountingSort {
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        // original array
        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }

        // sorting
        // count array
        int j = 0;
        for(int i=0; i<count.length; i++) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i] --;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,4,1,3,2,4,3,7};
        countingSort(arr);
        System.out.println("Sorted array is: ");
        System.out.println(Arrays.toString(arr));
    }
}
