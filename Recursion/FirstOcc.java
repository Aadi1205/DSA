package Recursion;

public class FirstOcc { 
    // WAF to find the first Occ of an element in an array
    public static int firstOcc(int[] arr, int key, int i) { // i=0
        
        if(arr[i] == key) {
            return i;
        }
        if(i == arr.length-1) {
            return -1;
        }

        return firstOcc(arr, key, i+1); // i=i+1
    }

    // WAF to find the last Occ of an element in an array
    public static int lastOcc(int[] arr, int key, int i) {
        if(arr[i] == key) { //finding last occ
            return i;
        }
        if(i == 0) {  // base case
            return -1;
        }

        return lastOcc(arr, key, i-1); // check previous index
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,6,5};
        System.out.println(firstOcc(arr, 5, 0));
        System.out.println(lastOcc(arr, 6, arr.length-1));
    }
}

