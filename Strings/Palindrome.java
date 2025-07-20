// IMP Question
package Strings;

public class Palindrome { 
    public static boolean Pal(String str) { // Time complexity: O(n), Space complexity: O(n)
         int n = str.length();
        for(int i=0; i<n/2; i++) {
            if(str.charAt(i) != str.charAt(n-1-i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(Pal("Level"));


    }
    
}
