// A substring is a contiguous part of a string.
// A subsequence is a sequence of characters in order but not necessarily continuous.
// For ex: Hello, World: Substring: Hell; 
// SubSequence: Hlo i.e. non continuous;
package Strings;

public class SubString {
    public static String substring(String str, int si, int ei) { // this is user defined function
        StringBuilder substr = new StringBuilder();
        for(int i=si; i<ei; i++) {
            // substr += str.charAt(i); // for string
            substr.append(str.charAt(i)); // for stringBuilder
        }
        return substr.toString();
    }
    
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(substring(str, 0, 5)); // Output: Hello

        // java has it's own substring function: 
        // str.substring(si, ei) // this is inbuilt function
        
        System.out.println(str.substring(0,5));

        String sub = str.substring(5,10);
        System.out.println(sub);

    }
    
}
