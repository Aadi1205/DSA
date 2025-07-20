package Stack;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String str) { //TC: O(n), SC:O(n)
        Stack<Character> s = new Stack<>();
        
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            //opening
            if(ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            }
            //closing
            else {
                if(s.isEmpty()) {
                    return false;
                }
                else if((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}') || (s.peek() == '[' && ch == ']')) {
                    s.pop();
                }
                else {
                    return false;
                }
            }
        }
        
        if(s.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "([{}][])"; //true
        System.out.println(isValid(str));
    }
}
