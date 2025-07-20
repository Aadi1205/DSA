package Strings.HomeWork;

public class FirstOcc {
    public static int firstOcc(String str, String pattern) {
        for(int i=0; i<=str.length()-pattern.length(); i++) { // to avoid index out of bounds exception  
            StringBuilder sb = new StringBuilder();
            for(int j=i; j < i+pattern.length(); j++) {
                sb.append(str.charAt(j));
            }
            if(pattern.equals(sb.toString())) {
                return i;
            }

        }
        return -1;
    }
    
    public static void main(String[] args) {
        System.out.println(firstOcc("abcabcabc", "abc"));  // 0
    }
}
