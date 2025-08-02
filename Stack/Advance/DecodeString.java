package Stack.Advance;

import java.util.*;

public class DecodeString {
    public static String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder currStr = new StringBuilder();
        int num = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0'); // for multi-digit numbers
            } else if (ch == '[') {
                numStack.push(num);
                strStack.push(currStr);
                num = 0;
                currStr = new StringBuilder();
            } else if (ch == ']') {
                int repeat = numStack.pop();
                StringBuilder prevStr = strStack.pop();
                for (int i = 0; i < repeat; i++) {
                    prevStr.append(currStr);
                }
                currStr = prevStr;
            } else {
                currStr.append(ch);
            }
        }

        return currStr.toString();
    }

    public static void main(String[] args) {
        String s = "2[cv]";
        System.out.println(decodeString(s)); 
    }
}
