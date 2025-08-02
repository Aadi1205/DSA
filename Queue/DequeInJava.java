package Queue;
import java.util.*;
public class DequeInJava {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>(); // deque is the interface and LinkedList is the implementation class
        deque.addFirst(1); //1
        deque.addFirst(2); // 2 1
        deque.addLast(3); // 2 1 3
        deque.addLast(4); // 2 1 3 4

        System.out.println("First Ele: " + deque.getFirst());
        System.out.println("Last Ele: " + deque.getLast());
        System.out.println("Size: " + deque.size());
        
        System.out.println("original queue " + deque);

        deque.removeLast();
        System.out.println("Remove Last " + deque);

        deque.removeFirst();
        System.out.println("Remove First " +deque);
    }
}
