package Queue;
import java.util.*;
public class QueueUsingDeque {
    static class Queue {
        Deque<Integer> dq = new ArrayDeque<Integer>();

        //enqueue
        public void enqueue(int data) {
            dq.addLast(data);
        }
        //dequeue
        public int dequeue() {
            int top = dq.removeFirst();
            return top;
        }
        //peek
        public int peek() {
            return dq.getFirst();
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("Dequeued item is " + q.dequeue());
        System.out.println("Peeked item is " + q.peek());
    }
}
