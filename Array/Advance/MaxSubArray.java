// max sub array Sum 
package Advance;
// 3 Approach
// brute force, prefix sum approach, Kadane's Algo
public class MaxSubArray { 
    public static void sum(int arr[]) { // brute force
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                sum = 0;
                for(int k=i; k<=j; k++) {
                    sum = sum + arr[k];
                }
                System.out.println("Current Sum: " + sum);
                if(sum > max) {
                max = sum;
            }
            }
           
        }
        System.out.println();
        System.out.println("Max sub array sum is " + max);
    }

    public static void prefixSum(int arr[]) { // prefix sum approach
      int currSum = 0;
      int maxSum = Integer.MIN_VALUE;
      int prefix[] = new int[arr.length];
      
      prefix[0] = arr[0]; // first element of prefix array is the first element of the input array
      // calculate prefix array
      for(int i=1; i<prefix.length; i++) { // start from the second element
        prefix[i] = prefix[i-1] + arr[i]; // add the current element to the previous prefix sum
      }

      for(int i=0; i<arr.length; i++) {
        // int start = i;
        for(int j=i; j<arr.length; j++) {
            // int end = j;

            currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];

            if(maxSum < currSum) {
                maxSum = currSum;
            }
        }
    }
    System.out.println("Max sum: " + maxSum);
}


    public static void Kad(int arr[]) { //optimized
        int currSum = 0; 
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];  // to avoid negative sum error
            maxSum = Math.max(maxSum, currSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        System.out.println("Maximum contiguous sum is " + maxSum);
    }
    public static void main(String args[]) {
        int arr[] = {1,-2,6,-1,3};
        sum(arr);
    }


}
