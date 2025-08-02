package Queue;
import java.util.*;
public class Interleave2Halves {
    public static void interLeave(Queue<Integer> q) {
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size(); 

        for(int i=0; i<size/2; i++) { //cannot use size() here as it will throw exception
            //because size of queue is change in every iteration
            firstHalf.add(q.remove());
        }
        while(!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());

        }
    }

    public static void oddInterLeave(Queue<Integer> q) {
        int size = q.size();
        int half = size / 2;

        Queue<Integer> firstHalf = new LinkedList<>();

        // Step 1: Store first half
        for (int i = 0; i < half; i++) {
            firstHalf.add(q.remove());
        }

        // Step 2: Interleave firstHalf and remaining (secondHalf)
        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove()); // 1 from first half
            if (!q.isEmpty()) {
                q.add(q.remove());     // 1 from second half
            }
        }

        // Queue is now interleaved
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=10; i++) {
            q.add(i);
        }
        //interleave function
        interLeave(q);
        //print queue
        while(!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
        

    }
}
