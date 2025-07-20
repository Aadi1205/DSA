package Strings.HomeWork;
// import java.util.*; for collection
public class ReverseWordOrder {
    public static String reverse(String str) {
        String[] s = str.trim().split("\\s+");
        StringBuilder reverse = new StringBuilder();

        for(int i=s.length-1; i>=0; i--) {
            reverse.append(s[i]);

            if(i != 0) {
                reverse.append(" ");
            }
        }

        return reverse.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverse("Hi, I am learning Java"));
    }
}
