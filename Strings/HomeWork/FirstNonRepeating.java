package Strings.HomeWork;

public class FirstNonRepeating {
    //My code brute force Approach
    public static char firstNonRepeat(String str) {
        for(int i=0; i<str.length(); i++) {
            int count = 0;
            for(int j=0; j<str.length(); j++) {
                if(i != j && str.charAt(i) == str.charAt(j)) {
                    count++;

                }
            }
            if(count == 0) {
                return str.charAt(i);
            }
        }
        return 0;
    }

    // optimized code
    public static char firstNonRepeat2(String str) {
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(str.indexOf(ch) == str.lastIndexOf(ch)) {
                return ch;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeat2("abcabegdkdgh"));
    }
}
