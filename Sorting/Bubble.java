package Sorting;

public class Bubble {
    public static void BubbleSort(int arr[]) {
        int n = arr.length;
        for(int i=0; i<n-1; i++) {
            int swap=0;
            for(int j=0; j<n-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                    swap ++;               
                } 
            }
             if(swap == 0) {
                    break;
                }
            
        }

        PrintArr(arr);
    }
    public static void PrintArr(int arr[]) {
       for(int i=0; i<arr.length; i++) {
           System.out.print(arr[i] + " ");
       }    
       System.out.println();
    
    }
  public static void main(String args[]) {
    int arr[] = {5,4,13,2};
    BubbleSort(arr);
  }
}