package Stack;
import java.util.Stack;
public class DuplicateParentheses {
    public static boolean duplicateParentheses(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);       
            //closing
            if(ch == ')') {
                int count = 0;
                while(s.pop() != '(') {
                    count++;
                }
                if(count < 1) {
                    return true; //duplicate exist
                }
            }

            else {
                //opening
                s.push(ch); //push the '(', operator or operands
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "(((a + (b))) + (c + d))"; //given string is already a valid string
        String str2 = "((a+b) + (c + d))";
        System.out.println(duplicateParentheses(str));
        System.out.println(duplicateParentheses(str2));

    }
}
