package Strings.HomeWork;
import java.util.Arrays;
public class LongestCommonPrefix {
    public static String prefix(String[] words) {
        
        StringBuilder result = new StringBuilder();

        //sort the array
        Arrays.sort(words);

        // get the first and last strings
        char[] first = words[0].toCharArray();
        char[] last = words[words.length - 1].toCharArray();

        //start comparing
        for(int i=0; i<first.length; i++) {
            if(first[i] != last[i]) {
                break;
            }
            result.append(first[i]);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + prefix(words));
    }
}
