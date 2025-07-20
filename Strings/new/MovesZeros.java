package Strings.HomeWork;

public class MovesZeros {
    public static void moveZeroes(int[] arr) {
        int j = 0; // pointer for next non-zero

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        printArr(arr);
    }
}


//my Logic: bubble sort O(n^2)
// public static void array(int[] arr) {
//         for(int i=0; i<arr.length; i++) {
//             for(int j=i; j<arr.length; j++) {
//                 if(arr[i] == 0) {
//                     int temp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = temp;
//                 }
//             }
//         }
//     }