package Stack.Advance;

import java.util.*;

public class SimplifyPath {
    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");

        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                continue; // ignore empty and current dir
            } 
            else if (part.equals("..")) {
                if (!stack.isEmpty()) {
                        stack.pop(); // go back
                    }
            } 
            else {
                stack.push(part); // valid folder
            }
        }

        // Build the simplified path
        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.append("/").append(dir);
        }

        return result.length() == 0 ? "/" : result.toString();
    }

    public static void main(String[] args) {
        System.out.println(simplifyPath("/home/user/./playlist/../movies"));   // Output: /home/user/movies
        System.out.println(simplifyPath("/a/.."));              // Output: /
        System.out.println(simplifyPath("/a/./b/../../c/"));    // Output: /c
    }
}
