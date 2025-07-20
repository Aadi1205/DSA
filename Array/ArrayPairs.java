public class ArrayPairs { // nested loop
    public static void Pairs(int arr[]) {
        int tp = 0; // formula to calculate number of pairs: n(n-1)/2
        for(int i=0; i<arr.length; i++) { // pair for each ith element ---> i<arr.length;
            for(int j=i+1; j<arr.length; j++) {// for i=n; j loop doesn't run as j=i+1 due to j<n; condition fails immediately
                System.out.print("( " + arr[i] + ", " + arr[j] + " )" + ", ");
                tp++; 
            }
            System.out.println();
            
        }
        System.out.println("Total Pairs: " + tp);
    }
    public static void main(String args[]) {
        int arr[] = {2,4,6,8,10};
        Pairs(arr);

    }
}
