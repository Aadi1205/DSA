package Stack;

import java.util.Stack;
public class Stack3 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        
        s.push(1);
        s.push(2);
        s.push(3);

        // while (!s.isEmpty()) {
        //     System.out.println(s.peek());
        //     s.pop();
        // }

        System.out.println("Top: " + s.peek());   // Peek
        System.out.println("Pop: " + s.pop());    // Pop
        System.out.println("Is empty? " + s.isEmpty());
        System.out.println("Size: " + s.size());
        System.out.println("Position of 10: " + s.search(10)); // Search

        s.clear(); // Clear stack
        System.out.println("After clear, is empty? " + s.isEmpty());
    }
}
