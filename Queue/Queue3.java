package Queue;
import java.util.Queue;
import java.util.LinkedList;
public class Queue3 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); // -> when you need queue + features
        //Queue<Integer> q = new ArrayDeque<>(); -> use when you just need a fast enqueue/dequeue
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
