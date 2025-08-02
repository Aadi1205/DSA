package Stack;
import java.util.*;

public class NextGreaterEle {

    // Function to find Next Greater Element to the right
    public static int[] nextGreaterRight(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int[] nextGreater = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            // 1. Remove all smaller or equal elements
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // 2. Set result
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }

            // 3. Push current index
            s.push(i);
        }

        return nextGreater;
    }

    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        int[] result = nextGreaterRight(arr);

        System.out.println("Next Greater Elements to the Right:");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
