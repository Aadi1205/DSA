package Recursion.HomeWork;

public class PrintIdx {
    public static void printIdx(int[] arr, int key, int idx) {
        if(arr[idx] == key) {
            System.out.print(idx + " ");
        }
        if(idx == arr.length-1) {
            return;
        }
        printIdx(arr, key, idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        printIdx(arr, 2, 0);
    }
}
