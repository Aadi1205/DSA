//                                                  ----IMP----
public class SubArray {
    public static void subArray(int arr[]) {
        int ts = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    // int subArr[] = Arrays.copyOfRange(arr, start, end+1);
                    System.out.print(arr[k] + " "); // print sub array
                    sum = sum + arr[k];
                }
                System.out.println();
                ts++; // total sub array count

            }
            System.out.println("Sum of SubArray: " + sum);
            System.out.println();

        }
        System.out.println("Total SubArray: " + ts);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 8, 10 };
        subArray(arr);
    }
}
