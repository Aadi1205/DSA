package Queue.Advance;
import java.util.*;

public class ConnectRopes {
    public static int minCost(int[] ropes) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add all ropes to the min-heap
        for (int rope : ropes) {
            pq.add(rope);
        }

        int totalCost = 0;

        // Keep connecting the two smallest ropes
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();

            int cost = first + second;
            totalCost += cost;

            pq.add(cost); // Add the new rope back
        }

        return totalCost;
    }

    public static void main(String[] args) {
        int[] ropes = {4, 3, 2, 6};
        System.out.println("Minimum cost to connect ropes: " + minCost(ropes));
    }
}
