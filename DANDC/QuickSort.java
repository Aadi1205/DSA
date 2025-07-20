package DANDC;

public class QuickSort {
    public static void printArr(int[] arr) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void quickSort(int[] arr, int si, int ei) {
        //base case
        if(si >= ei) {
            return;
        }

        // last element = pivot
        int pIdx = partition(arr, si, ei);
        quickSort(arr,si,pIdx-1); // left part
        quickSort(arr,pIdx+1,ei); // right part
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei]; // last element as pivot
        int i = si-1; // to make place for els smaller than pivot

        for(int j=si; j<ei; j++) {
            if(arr[j] <= pivot) {
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];  // Wrong: pivot = arr[i] because call by value
                arr[i] = temp;
            }
        }
        //swap pivot to correct position
         i++;
        int temp = pivot;
       arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String[] args) {
        int[] arr = {6,3,9,8,2,5};
        quickSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
