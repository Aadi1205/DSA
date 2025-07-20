package Sorting;

public class Aditya
{
    public static void bubbleSort(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
    }
    
    public static void selectionSort(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int minIndex = i;
            for(int j=i; j<arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void insertionSort(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            
            while(prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
    
    public static void printArr(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
	public static void main(String[] args) {
		int[] arr = {5,3,4,2,1};
		insertionSort(arr);
		printArr(arr);
		
	}
}