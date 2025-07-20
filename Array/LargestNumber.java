public class LargestNumber {
    public static void Largest(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println("Largest element is: " + max);
        System.out.println("Smallest element is: " + min);
    }

    public static void main(String args[]) {
        
        int arr[] = {10, 20, 30, 40, 50};
        Largest(arr);
    }
}
