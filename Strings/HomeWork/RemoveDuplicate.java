package Strings.HomeWork;

public class RemoveDuplicate {
    public static void removeDup(String str) {
        str = str.toLowerCase(); //save the result in str is necessary 
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            // check if char is already in result
            // sb.indexOf(): gives first occurrence of a char or substring in a string
            // String.valueOf(ch): convert char into String we need it because indexOf() does not take char;
            if(sb.indexOf(String.valueOf(ch)) == -1) {
                sb.append(ch);
            }
        }

        System.out.println("After removing duplicates: " + sb);
    }
    public static void main(String[] args) {
        removeDup("PrograMming");
    }
}
