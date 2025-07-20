package Recursion.HomeWork;

public class StringLength {

    public static int findLength(String str) {
        // base case
        if (str.equals("")) {
            return 0;
        }

        // recursive case: remove first char and add 1
        //str.substring(1) gives the rest of the string after removing the first char.
        return 1 + findLength(str.substring(1));
    }

    public static int findLength2(String str, int index) {
    if (index == str.length()) return 0;
    return 1 + findLength2(str, index + 1);
}


    public static void main(String[] args) {
        String input = "Tony Stark";
        int length = findLength(input);
        System.out.println("Length of \"" + input + "\" is: " + length);
    }
}
