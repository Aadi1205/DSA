// 
package Strings;

public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        
        for(char ch='a'; ch<='z'; ch++) { // Time complexity: O(26) because we are only iterating over 26 characters
            sb.append(ch); 
        }
       
        System.out.println(sb);
        System.out.println(sb.length());

        String str = sb.toString();
        System.out.println("StringBuilder is converted into String: "+ str);

    }
    
}
