package Strings.Hard;

public class LongestSubstring
{
    public static String longestSubstring(String str) {
        StringBuilder longest = new StringBuilder("");
        
        for(int i=0; i<str.length(); i++) {
            StringBuilder sb = new StringBuilder("");
            
            for(int j=i; j<str.length(); j++) {
                char ch = str.charAt(j);
                if(sb.indexOf(String.valueOf(ch)) == -1) {
                    sb.append(str.charAt(j));
                }
                else {
                    break;
                }
            }
            
            if(longest.length() < sb.length()) {
                longest = sb;
            }
        }
        return longest.toString();
    }
    
	public static void main(String[] args) {
		System.out.println(longestSubstring("abcabcdabd"));
	}
}