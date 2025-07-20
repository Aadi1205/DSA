// pick the smallest (from unsorted), put it at the beginning
// time complexity: O(n^2)
package Sorting;

public class Selection {
    public static void SelectionSort(int arr[]) {
        int n = arr.length;
        for(int i=0; i<n-1; i++) {
            int minPos = i;
            for(int j=i+1; j<n; j++){
                if(arr[minPos] > arr[j]) { // for decreasing order change > to <;
                    minPos = j;
                }
            }
            //swaping
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

        for(int i=0; i<arr.length; i++) {
           System.out.print(arr[i] + " ");
       }    
       System.out.println();
    
        
    }
    public static void main(String[] args) {
        int arr[] = {4,5,3,1,2};
        SelectionSort(arr);
    }
    
}
