package DANDC;

public class MergeSort {
    public static void printArr(int[] arr) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        // base case
        if(si >= ei) {
            return;
        }
        //job
        int mid = si + (ei - si) / 2; //or (si + ei) / 2;
        mergeSort(arr, si, mid); // left part
        mergeSort(arr, mid+1, ei); // right part
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        // left(0,3)=4 ele.  right(4,6)=3 ele. -> 6-0+1=7 elements
        int temp[] = new int[ei-si+1];

        int i = si; //iterator for left part
        int j = mid+1; //iterator for right part
        int k = 0; //iterator for temp[]

        while(i <= mid && j <= ei) {
            if(arr[i] < arr[j]) { // left part is smaller
                temp[k] = arr[i]; // copy to temp[]
                i++;
                k++;
            }   
            else { // right part is smaller
                temp[k] = arr[j]; // copy to temp[]
                j++;
                k++;
            }
        }
        //remaining elements in left part
        while(i <= mid) {
            temp[k++] = arr[i++]; //unary operator first copy then increment
        }

        //remaining elements in right part 
        while(j <= ei) {
            temp[k++] = arr[j++]; //unary operator first copy then increment
        }

        // copy temp to original arr
        for(k=0, i=si; k<temp.length; k++, i++) { // two pointers i and k
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
