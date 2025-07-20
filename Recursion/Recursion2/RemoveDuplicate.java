package Recursion.Recursion2;

public class RemoveDuplicate { 
    public static void removeDuplicates(String str, int idx, StringBuilder sb, boolean map[]) {
        // Don't create sb inside function; it resets in every recursive call.
        // base case
        if(idx == str.length()) {
            System.out.println(sb);
            return;
        }

        //job
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true) { // currChar - 'a' => ASCII value of char - ASCII value of 'a'
            //duplicate
            removeDuplicates(str, idx+1, sb, map);
        }
        else {
            //update map array
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, sb.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "aadiitya";
        removeDuplicates(str,0, new StringBuilder(), new boolean[26]);
    }
}
