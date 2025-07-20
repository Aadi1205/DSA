import java.util.*;

public class Adi {
    

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Stack2 {
        Node head = null;

        //isEmpty() 
        public boolean isEmpty() {
            return head == null;
        }

        //push
        public void push(int data) {
            Node newNode = new Node(data);

            newNode.next = head;
            head = newNode;
        }

        //pop
        public int pop() {
            if(isEmpty()) {
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        //peek
        public int peek() {
            if(isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public String reverse(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder sb = new StringBuilder();

        while(!s.isEmpty()) {
            sb.append(s.pop());
        }

        return sb.toString();
    }
    
    public static void main(String[] args) {
        Stack2 s = new Stack2();

        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
