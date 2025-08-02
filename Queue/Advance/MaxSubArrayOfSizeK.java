package Queue.Advance;
import java.util.*;
public class MaxSubArrayOfSizeK { 
    public static void max(int[] arr, int n, int k) { // TC: O(n*k)
        int max = Integer.MIN_VALUE;
        for(int i=0; i<=n-k; i++) {
            for(int j=i; j<i+k; j++) {
                max = Math.max(arr[j], max);
            }
            System.out.print(max + " ");
            max = Integer.MIN_VALUE;
        }
    }

    public static void max2(int[] arr, int n, int k) { // TC: O(n)
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            // Remove elements out of this window
            while (!dq.isEmpty() && dq.peek() <= i - k) {
                dq.pollFirst();
            }

            // Remove all smaller elements (they are useless)
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }

            // Add current element at the back of deque
            dq.addLast(i);

            // Print the max (front of deque) once we hit size k
            if (i >= k - 1) {
                System.out.print(arr[dq.peekFirst()] + " ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,4,5,2,3,6};
		max(arr, arr.length, 3);
    }
}
