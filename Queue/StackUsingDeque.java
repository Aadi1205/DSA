package Queue;
import java.util.*;
public class StackUsingDeque {
    static class Stack {
        Deque<Integer> dq = new LinkedList<>();
        //isEmpty
        public boolean isEmpty() {
            return dq.isEmpty();
        }
        //add
        public void push(int data) {
            dq.addLast(data);
        }
        //remove
        public int pop() {
            int top = dq.removeLast();
            return top;
        }
        //peek
        public int peek() {
            return dq.peekLast();
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Peek " + stack.peek());

        System.out.print(stack.pop() + " ");
        System.out.print(stack.pop() + " ");
        System.out.print(stack.pop() + " ");
        System.out.print(stack.pop() + " ");
        System.out.print(stack.pop() + " ");
    

        

        
    }
}
