package Strings.HomeWork;
import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String str1 , String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        // if(char1.length == char2.length) {
        //     if(Arrays.equals(char1, char2)) { // Incorrect: char1.equals(char2) compares references, not array contents
        //         return true;
        //     }
        //     else {
        //         return false;
        //     }
        // }
        // else {
        //     return false;
        // }
        return Arrays.equals(char1, char2);
        
    }
    public static void main(String[] args) {
        String str1 = "Heart";
        String str2 = "Earth";
        System.out.println(isAnagram(str1, str2));
        
    }
}
