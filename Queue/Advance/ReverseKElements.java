package Queue.Advance;
import java.util.*;
public class ReverseKElements {
    public static void reverse(Deque<Integer> dq, int k) {
        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<k; i++) {
            q.add(dq.removeFirst());
        }
        while(!q.isEmpty()) {
            dq.addFirst(q.remove());
        }
    }
    public static void main(String[] args) {
        Deque<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        int k = 5;

        reverse(q, k);
        System.out.println(q);

    }
}
