public class Aditya {
    public static void BuySell(int arr[]) {
        int n = arr.length;
        int sum = 0;
       for(int i=0; i<n; i++) {
        sum = 0;
        for(int j=i; j<n; j++) {
            for(int k=i; k<=j; k++) {
                System.out.print(arr[k] + " ");
                sum += arr[k];
            }
            System.out.println();
        }
        System.out.println("Sum of all possible subArrays is " + sum);
        System.out.println();
       }
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        BuySell(arr);
        
    }
}