package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    static class Stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // Push is O(1)
        public void push(int data) {
            q1.add(data);
        }

        // Pop is O(n)
        public int pop() {
            if (isEmpty()) {
                System.out.println("Empty stack");
                return -1;
            }

            int top = -1;

            // Move elements except last
            while (q1.size() > 1) {
                q2.add(q1.remove());
            }

            // The last element is the top of the stack
            top = q1.remove();

            // Swap q1 and q2
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;

            return top;
        }

        // Peek is O(n)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty stack");
                return -1;
            }

            int top = -1;

            // Move all except last
            while (q1.size() > 1) {
                q2.add(q1.remove());
            }

            // Last element is the top
            top = q1.remove();
            q2.add(top);  // Put it back

            // Swap queues
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;

            return top;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
