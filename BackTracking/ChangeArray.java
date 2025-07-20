package BackTracking;

public class ChangeArray {
    public static void changeArray(int arr[], int i, int val) {
        //base case
        if(i == arr.length) {
            printArr(arr);
            return;
        }
        //recursion
        arr[i] = val;
        changeArray(arr, i+1, val+1);
        arr[i] = arr[i] - 2;

    }
    public static void printArr(int arr[]) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArray(arr, 0, 1);
        printArr(arr);
    }
}
