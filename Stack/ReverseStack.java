package Stack;
import java.util.*;
public class ReverseStack {
    public static void printStack(Stack<Integer> s) {
        while(!s.isEmpty()) {
            System.out.println(s.pop()); //because we use pop method here
        }
        System.out.println("");
    }

    public static void pushAtBottom(Stack<Integer> s, int data) { //TC: O(n)
        //base case
        if(s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        //recursion
        pushAtBottom(s, data);
        //backtracking
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        //printStack(s);
        //if we write this function here it removes all the ele from the stack
        //nothing to print again

        reverseStack(s);
        printStack(s);

    }
}
