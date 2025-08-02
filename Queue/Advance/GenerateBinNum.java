package Queue.Advance;

import java.util.*;

public class GenerateBinNum {
    public static void generateBinary(int n) {
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=1; i<=n; i++) {
            int num = i;
            while(num > 0) {
                q.add(num % 2);
                num = num / 2;
            }
            
            while(!q.isEmpty()) {
                System.out.print(q.remove());
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        generateBinary(5);
    }
}
