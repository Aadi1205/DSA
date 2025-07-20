package Strings;

public class StringCompression {

    public static String stringCompression(String str) { // Time complexity: O(n), Space complexity: O(n)
        String newStr = "";

        for(int i=0; i<str.length(); i++) {
            Integer count = 1; // we have to add this count in string so int will not work here
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) { // i<n-2 because we are using i+1 in while loop
                count++;
                i++;
            }
            newStr += str.charAt(i); // to print str like abc because while loop will not execute in this case
            if(count > 1) {
                newStr += count.toString(); // That's why we use Integer instead of int
            }
        }
        return newStr;
    }

    // New method using StringBuilder for better performance
    public static String Compression(String str) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            int count = 1;
            while(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbcccdd";  
        System.out.println(stringCompression(str));  // Using original method
        System.out.println(Compression(str));        // Using new method with StringBuilder
    }
}
