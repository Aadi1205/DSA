// this question is asked in an interview
package Strings;

public class CaseConversion {
    public static String Capitalized(String str) {
        StringBuilder sb = new StringBuilder();

        // Capitalize the first character
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) { // Time complexity: O(n)
            // If current character is space and next character exists
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i)); // append the space
                i++;
                sb.append(Character.toUpperCase(str.charAt(i))); // capitalize next word
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hi, i am a java programmer";
        System.out.println(Capitalized(str));  // Corrected method call
    }
}
