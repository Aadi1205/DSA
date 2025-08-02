package Stack.Advance;

import java.util.*;

public class PalindromeLL {
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean isPalindrome(Node head) {
        Stack<Character> stack = new Stack<>();
        Node temp = head;

        // Step 1: Push all elements into stack
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        // Step 2: Traverse again and compare
        temp = head;
        while (temp != null) {
            if (stack.pop() != temp.data) {
                return false;
            }
            temp = temp.next;
        }

        return true;
    }

    public static void main(String[] args) {
        // Example: a -> b -> c -> b -> a
        Node head = new Node('a');
        head.next = new Node('b');
        head.next.next = new Node('c');
        head.next.next.next = new Node('b');
        head.next.next.next.next = new Node('a');

        System.out.println(isPalindrome(head)); // Output: true
    }
}
