package Sorting;
import java.util.Arrays;
import java.util.Collections;
public class BuiltInSort {
    public static void main(String args[]) {
        int arr[] = {5,3,1,2,4};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //print Array

        int arr1[] = {5,3,1,2,4};
        Arrays.sort(arr1, 0, 2); // sort from index 0 to 1 // ending index is non-inclusive
        System.out.println(Arrays.toString(arr1)); // print Array

        System.out.println();

        System.out.println("Reverse sorting of an array");

        // Integer is object // int is primitive
        Integer arr2[] = {5,3,1,2,4}; //Arrays.sort(arr2, Collections.reverseOrder()) only works with Integer[], not int[]
        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr2)); // print Array

        System.out.println();

        System.out.println("Reverse sorting from index 0 to 3");

        Integer arr3[] = {5,3,1,2,4};
        Arrays.sort(arr3, 0, 3, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr3));
    }
}
