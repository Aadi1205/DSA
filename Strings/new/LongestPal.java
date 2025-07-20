package Strings.HomeWork;

public class LongestPal {
    public static int expandAroundCenter(String str, int left, int right) {

        // Check left and right limits before using charAt to avoid StringIndexOutOfBoundsException
        while (left>=0 && right<str.length() && str.charAt(left) == str.charAt(right) ) {
            left--;
            right++;
        }
        return right - left - 1; //length of the palindrome
    }

    public static String longestPal(String str) {
        if(str == null || str.length() < 1) {
            return "";
        }

        int start = 0, end = 0;

        for(int i=0; i<str.length(); i++) {
            int len1  = expandAroundCenter(str,i,i); // odd length pal
            int len2 = expandAroundCenter(str,i,i+1); // even length pal
            int len = Math.max(len1, len2);

            // i=center of pal; len = len of pal
            // Use (len - 1)/2 to correctly center the palindrome; len/2 cuts off 1 extra on the left for odd lengths.
            if(len > end - start) { // update start and end indices
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return str.substring(start, end + 1);
    }
    public static void main(String[] args) {
        System.out.println(longestPal("babad"));
    }
}
