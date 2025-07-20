package Recursion.HomeWork;

public class CountSubstring {

    public static int count = 0;

    public static void countSubstrings(String str, int start, int end) {
        // Base case: if start reaches the end of the string
        if (start == str.length()) {
            return;
        }

        // If end has reached the end, move to next start
        if (end == str.length()) {
            countSubstrings(str, start + 1, start + 1);
            return;
        }

        // If the substring from start to end starts and ends with same char
        if (str.charAt(start) == str.charAt(end)) {
            count++;
        }

        // Recursive call to increase end index
        countSubstrings(str, start, end + 1);
    }

    public static void main(String[] args) {
        String str = "abcab";
        countSubstrings(str, 0, 0);
        System.out.println(count); // Output: 7
    }
}
